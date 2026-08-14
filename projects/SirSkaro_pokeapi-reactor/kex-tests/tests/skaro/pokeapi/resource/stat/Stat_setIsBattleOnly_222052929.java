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

public class Stat_setIsBattleOnly_222052929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1532;
     Object term1648;

    public Stat_setIsBattleOnly_222052929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1533 = new Integer(1141317871);
        Integer term1547 = new Integer(890669485);
        Boolean term1549 = new Boolean(true);
        Integer term1555 = new Integer(691577392);
        Object term1554 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1554, term1554.getClass(), "change", term1555);
        setField(term1554, term1554.getClass(), "move", null);
        Integer term1558 = new Integer(-893623680);
        Object term1557 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1557, term1557.getClass(), "change", term1558);
        setField(term1557, term1557.getClass(), "move", null);
        Integer term1561 = new Integer(-1963434938);
        Object term1560 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1560, term1560.getClass(), "change", term1561);
        setField(term1560, term1560.getClass(), "move", null);
        Integer term1564 = new Integer(906181092);
        Object term1563 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1563, term1563.getClass(), "change", term1564);
        setField(term1563, term1563.getClass(), "move", null);
        Integer term1567 = new Integer(1045657203);
        Object term1566 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1566, term1566.getClass(), "change", term1567);
        setField(term1566, term1566.getClass(), "move", null);
        Integer term1570 = new Integer(1386130016);
        Object term1569 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1569, term1569.getClass(), "change", term1570);
        setField(term1569, term1569.getClass(), "move", null);
        ArrayList term1552 = new ArrayList();
        ((ArrayList) term1552).add(term1554);
        ((ArrayList) term1552).add(term1557);
        ((ArrayList) term1552).add(term1560);
        ((ArrayList) term1552).add(term1563);
        ((ArrayList) term1552).add(term1566);
        ((ArrayList) term1552).add(term1569);
        Integer term1577 = new Integer(1072005683);
        Object term1576 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1576, term1576.getClass(), "change", term1577);
        setField(term1576, term1576.getClass(), "move", null);
        Integer term1580 = new Integer(1861318859);
        Object term1579 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1579, term1579.getClass(), "change", term1580);
        setField(term1579, term1579.getClass(), "move", null);
        Integer term1583 = new Integer(1474524152);
        Object term1582 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1582, term1582.getClass(), "change", term1583);
        setField(term1582, term1582.getClass(), "move", null);
        Integer term1586 = new Integer(568954359);
        Object term1585 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1585, term1585.getClass(), "change", term1586);
        setField(term1585, term1585.getClass(), "move", null);
        ArrayList term1574 = new ArrayList();
        ((ArrayList) term1574).add(term1576);
        ((ArrayList) term1574).add(term1579);
        ((ArrayList) term1574).add(term1582);
        ((ArrayList) term1574).add(term1585);
        ((ArrayList) term1574).add(term1579);
        ((ArrayList) term1574).add(term1582);
        ((ArrayList) term1574).add(term1554);
        ArrayList term1591 = new ArrayList();
        ArrayList term1595 = new ArrayList();
        ArrayList term1599 = new ArrayList();
        Object term1630 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1632 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1630, term1630.getClass(), "name", "");
        setField(term1632, term1632.getClass(), "name", null);
        setField(term1632, term1632.getClass(), "url", null);
        setField(term1630, term1630.getClass(), "language", term1632);
        Object term1633 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1635 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1633, term1633.getClass(), "name", "");
        setField(term1635, term1635.getClass(), "name", null);
        setField(term1635, term1635.getClass(), "url", null);
        setField(term1633, term1633.getClass(), "language", term1635);
        Object term1636 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1636, term1636.getClass(), "name", "");
        setField(term1636, term1636.getClass(), "language", term1635);
        Object term1638 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1640 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1638, term1638.getClass(), "name", "");
        setField(term1640, term1640.getClass(), "name", null);
        setField(term1640, term1640.getClass(), "url", null);
        setField(term1638, term1638.getClass(), "language", term1640);
        Object term1641 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1643 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1641, term1641.getClass(), "name", "");
        setField(term1643, term1643.getClass(), "name", null);
        setField(term1643, term1643.getClass(), "url", null);
        setField(term1641, term1641.getClass(), "language", term1643);
        Object term1644 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1644, term1644.getClass(), "name", "");
        setField(term1644, term1644.getClass(), "language", term1643);
        ArrayList term1628 = new ArrayList();
        ((ArrayList) term1628).add(term1630);
        ((ArrayList) term1628).add(term1633);
        ((ArrayList) term1628).add(term1636);
        ((ArrayList) term1628).add(term1638);
        ((ArrayList) term1628).add(term1641);
        ((ArrayList) term1628).add(term1644);
        term1532 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term1551 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term1590 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term1603 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1532, term1532.getClass(), "id", term1533);
        setField(term1532, term1532.getClass(), "name", "TtGbVmKcnX");
        setField(term1532, term1532.getClass(), "gameIndex", term1547);
        setField(term1532, term1532.getClass(), "isBattleOnly", term1549);
        setField(term1551, term1551.getClass(), "increase", term1552);
        setField(term1551, term1551.getClass(), "decrease", term1574);
        setField(term1532, term1532.getClass(), "affectingMoves", term1551);
        setField(term1590, term1590.getClass(), "increase", term1591);
        setField(term1590, term1590.getClass(), "decrease", term1595);
        setField(term1532, term1532.getClass(), "affectingNatures", term1590);
        setField(term1532, term1532.getClass(), "characteristics", term1599);
        setField(term1603, term1603.getClass(), "name", "wBGfLpNNiZ");
        setField(term1603, term1603.getClass(), "url", "yUGCjlqgJE");
        setField(term1532, term1532.getClass(), "moveDamageClass", term1603);
        setField(term1532, term1532.getClass(), "names", term1628);
        term1648 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term1648;
        callMethod(klass, "setIsBattleOnly", argTypes, term1532, args);
    }

};


