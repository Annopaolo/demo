package lang.environment;

import java.util.LinkedList;
import java.util.HashMap;

import io.vavr.control.Either;
import lang.models.Block;
import lang.utils.AlreadyDefinedException;
import lang.utils.DemoException;
import lang.utils.NotDefinedException;

// Maps variables to values
public class Environment implements Cloneable {

    private LinkedList<HashMap<String, Either<Integer, Boolean>>> store;
    private static HashMap<String, Block> procTable;
    // private static HashMap<String, LinkedList<Either<Integer, Boolean>>>
    // chanTable;

    public Environment() {
        store = new LinkedList<>();
        procTable = new HashMap<>();
        // chanTable = new HashMap<>();
    }

    public Environment(LinkedList<HashMap<String, Either<Integer, Boolean>>> store) {
        this.store = store;
    }

    public void newScope() {
        store.addFirst(new HashMap<>());
    }

    public void exitScope() {
        store.removeFirst();
    }

    public void newVariable(String id, Either<Integer, Boolean> value) throws DemoException {
        if (store.getFirst().containsKey(id)) {
            throw new AlreadyDefinedException("Variable already defined: " + id);
        } else {
            store.getFirst().put(id, value);
            return;
        }
    }

    public Either<Integer, Boolean> getVariable(String id) throws DemoException {
        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).containsKey(id)) {
                return store.get(i).get(id);
            }
        }
        throw new NotDefinedException("Variable not defined: " + id);
    }

    public Either<Integer, Boolean> setVariable(String id, Either<Integer, Boolean> value) throws DemoException {
        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).containsKey(id)) {
                return store.get(i).put(id, value);
            }
        }
        throw new NotDefinedException("Variable not defined: " + id);
    }

    public void newProcedure(String id, Block body) throws DemoException {
        if (procTable.containsKey(id)) {
            throw new NotDefinedException("Procedure already defined: " + id);
        } else {
            procTable.put(id, body);
            return;
        }
    }

    public Block getProcedure(String id) throws DemoException {
        if (procTable.containsKey(id)) {
            return procTable.get(id);
        } else {
            throw new NotDefinedException("Procedure not defined: " + id);
        }
    }

    // public void declareChannel(String id) throws DemoException {
    // if (chanTable.containsKey(id)) {
    // // anybody can declare a channel, in order to read from it!
    // return;
    // } else {
    // chanTable.put(id, new LinkedList<>());
    // return;
    // }
    // }

    // public Either<Integer, Boolean> getValueFromChannel(String id) throws
    // Exception {
    // if (chanTable.containsKey(id)) {
    // // ugly and busy waiting
    // while (chanTable.get(id).isEmpty()) {
    // Thread.sleep(100);
    // }
    // return chanTable.get(id).removeLast();
    // } else {
    // throw new Exception("Procedure not defined: " + id);
    // }
    // }

    // public void addValueToChannel(String channelId, Either<Integer, Boolean>
    // value) throws DemoException {
    // if (chanTable.containsKey(channelId)) {
    // // no waiting
    // chanTable.get(channelId).addFirst(value);
    // return;
    // } else {
    // throw new Exception("Channel not defined: " + channelId);
    // }
    // }

    public Environment duplicate() {
        @SuppressWarnings("unchecked")
        LinkedList<HashMap<String, Either<Integer, Boolean>>> store2 = (LinkedList<HashMap<String, Either<Integer, Boolean>>>) store
                .clone();
        return new Environment(store2);
    }
}
