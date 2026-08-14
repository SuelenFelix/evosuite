package skaro.pokeapi.resource.stat;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static skaro.pokeapi.resource.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class Stat_getId_5345770991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531;

    public Stat_getId_5345770991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term532 = new Integer(767834723);
        Integer term546 = new Integer(-602026508);
        Boolean term548 = new Boolean(false);
        Integer term554 = new Integer(-157887805);
        Object term553 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term553, term553.getClass(), "change", term554);
        setField(term553, term553.getClass(), "move", null);
        Integer term557 = new Integer(1876565163);
        Object term556 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term556, term556.getClass(), "change", term557);
        setField(term556, term556.getClass(), "move", null);
        Integer term560 = new Integer(-817164822);
        Object term559 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term559, term559.getClass(), "change", term560);
        setField(term559, term559.getClass(), "move", null);
        Integer term563 = new Integer(-1016503459);
        Object term562 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term562, term562.getClass(), "change", term563);
        setField(term562, term562.getClass(), "move", null);
        Integer term566 = new Integer(-1968847291);
        Object term565 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term565, term565.getClass(), "change", term566);
        setField(term565, term565.getClass(), "move", null);
        Integer term569 = new Integer(579005622);
        Object term568 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term568, term568.getClass(), "change", term569);
        setField(term568, term568.getClass(), "move", null);
        Integer term572 = new Integer(-14890619);
        Object term571 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term571, term571.getClass(), "change", term572);
        setField(term571, term571.getClass(), "move", null);
        Integer term575 = new Integer(1632125673);
        Object term574 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term574, term574.getClass(), "change", term575);
        setField(term574, term574.getClass(), "move", null);
        ArrayList term551 = new ArrayList();
        ((ArrayList) term551).add(term553);
        ((ArrayList) term551).add(term556);
        ((ArrayList) term551).add(term559);
        ((ArrayList) term551).add(term562);
        ((ArrayList) term551).add(term565);
        ((ArrayList) term551).add(term568);
        ((ArrayList) term551).add(term571);
        ((ArrayList) term551).add(term574);
        Integer term582 = new Integer(454281060);
        Object term581 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term581, term581.getClass(), "change", term582);
        setField(term581, term581.getClass(), "move", null);
        Integer term585 = new Integer(-1786399638);
        Object term584 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term584, term584.getClass(), "change", term585);
        setField(term584, term584.getClass(), "move", null);
        ArrayList term579 = new ArrayList();
        ((ArrayList) term579).add(term581);
        ((ArrayList) term579).add(term584);
        ((ArrayList) term579).add(term574);
        ((ArrayList) term579).add(term581);
        ((ArrayList) term579).add(term553);
        ((ArrayList) term579).add(term568);
        ArrayList term590 = new ArrayList();
        ArrayList term594 = new ArrayList();
        ArrayList term598 = new ArrayList();
        Object term629 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term631 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term629, term629.getClass(), "name", "");
        setField(term631, term631.getClass(), "name", null);
        setField(term631, term631.getClass(), "url", null);
        setField(term629, term629.getClass(), "language", term631);
        Object term632 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term632, term632.getClass(), "name", "");
        setField(term632, term632.getClass(), "language", term631);
        Object term634 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term636 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term634, term634.getClass(), "name", "");
        setField(term636, term636.getClass(), "name", null);
        setField(term636, term636.getClass(), "url", null);
        setField(term634, term634.getClass(), "language", term636);
        ArrayList term627 = new ArrayList();
        ((ArrayList) term627).add(term629);
        ((ArrayList) term627).add(term632);
        ((ArrayList) term627).add(term634);
        term531 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term550 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term589 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term602 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term531, term531.getClass(), "id", term532);
        setField(term531, term531.getClass(), "name", "SPpkrGcPRr");
        setField(term531, term531.getClass(), "gameIndex", term546);
        setField(term531, term531.getClass(), "isBattleOnly", term548);
        setField(term550, term550.getClass(), "increase", term551);
        setField(term550, term550.getClass(), "decrease", term579);
        setField(term531, term531.getClass(), "affectingMoves", term550);
        setField(term589, term589.getClass(), "increase", term590);
        setField(term589, term589.getClass(), "decrease", term594);
        setField(term531, term531.getClass(), "affectingNatures", term589);
        setField(term531, term531.getClass(), "characteristics", term598);
        setField(term602, term602.getClass(), "name", "sEnIVFtZuQ");
        setField(term602, term602.getClass(), "url", "ZVecLZMLHF");
        setField(term531, term531.getClass(), "moveDamageClass", term602);
        setField(term531, term531.getClass(), "names", term627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term531, args);
    }

};


