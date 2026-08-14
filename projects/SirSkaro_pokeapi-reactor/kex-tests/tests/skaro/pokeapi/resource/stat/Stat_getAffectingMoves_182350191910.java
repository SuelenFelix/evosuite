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

public class Stat_getAffectingMoves_182350191910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;

    public Stat_getAffectingMoves_182350191910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1681 = new Integer(53410913);
        Integer term1695 = new Integer(-375014958);
        Boolean term1697 = new Boolean(true);
        ArrayList term1700 = new ArrayList();
        Integer term1707 = new Integer(1107176718);
        Object term1706 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1706, term1706.getClass(), "change", term1707);
        setField(term1706, term1706.getClass(), "move", null);
        Integer term1710 = new Integer(480137250);
        Object term1709 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1709, term1709.getClass(), "change", term1710);
        setField(term1709, term1709.getClass(), "move", null);
        Integer term1713 = new Integer(-341152642);
        Object term1712 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1712, term1712.getClass(), "change", term1713);
        setField(term1712, term1712.getClass(), "move", null);
        Integer term1716 = new Integer(-2015854073);
        Object term1715 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1715, term1715.getClass(), "change", term1716);
        setField(term1715, term1715.getClass(), "move", null);
        Integer term1719 = new Integer(538259104);
        Object term1718 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1718, term1718.getClass(), "change", term1719);
        setField(term1718, term1718.getClass(), "move", null);
        Integer term1722 = new Integer(96566506);
        Object term1721 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1721, term1721.getClass(), "change", term1722);
        setField(term1721, term1721.getClass(), "move", null);
        ArrayList term1704 = new ArrayList();
        ((ArrayList) term1704).add(term1706);
        ((ArrayList) term1704).add(term1709);
        ((ArrayList) term1704).add(term1712);
        ((ArrayList) term1704).add(term1715);
        ((ArrayList) term1704).add(term1718);
        ((ArrayList) term1704).add(term1721);
        ArrayList term1727 = new ArrayList();
        ArrayList term1731 = new ArrayList();
        ArrayList term1735 = new ArrayList();
        Object term1766 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1768 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1766, term1766.getClass(), "name", "");
        setField(term1768, term1768.getClass(), "name", null);
        setField(term1768, term1768.getClass(), "url", null);
        setField(term1766, term1766.getClass(), "language", term1768);
        Object term1769 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1771 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1769, term1769.getClass(), "name", "");
        setField(term1771, term1771.getClass(), "name", null);
        setField(term1771, term1771.getClass(), "url", null);
        setField(term1769, term1769.getClass(), "language", term1771);
        Object term1772 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1774 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1772, term1772.getClass(), "name", "");
        setField(term1774, term1774.getClass(), "name", null);
        setField(term1774, term1774.getClass(), "url", null);
        setField(term1772, term1772.getClass(), "language", term1774);
        Object term1775 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1775, term1775.getClass(), "name", "");
        setField(term1775, term1775.getClass(), "language", term1768);
        Object term1777 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1777, term1777.getClass(), "name", "");
        setField(term1777, term1777.getClass(), "language", term1771);
        Object term1779 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1781 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1779, term1779.getClass(), "name", "");
        setField(term1781, term1781.getClass(), "name", null);
        setField(term1781, term1781.getClass(), "url", null);
        setField(term1779, term1779.getClass(), "language", term1781);
        ArrayList term1764 = new ArrayList();
        ((ArrayList) term1764).add(term1766);
        ((ArrayList) term1764).add(term1769);
        ((ArrayList) term1764).add(term1772);
        ((ArrayList) term1764).add(term1775);
        ((ArrayList) term1764).add(term1777);
        ((ArrayList) term1764).add(term1779);
        term1680 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term1699 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term1726 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term1739 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1680, term1680.getClass(), "id", term1681);
        setField(term1680, term1680.getClass(), "name", "GEJABPlHSI");
        setField(term1680, term1680.getClass(), "gameIndex", term1695);
        setField(term1680, term1680.getClass(), "isBattleOnly", term1697);
        setField(term1699, term1699.getClass(), "increase", term1700);
        setField(term1699, term1699.getClass(), "decrease", term1704);
        setField(term1680, term1680.getClass(), "affectingMoves", term1699);
        setField(term1726, term1726.getClass(), "increase", term1727);
        setField(term1726, term1726.getClass(), "decrease", term1731);
        setField(term1680, term1680.getClass(), "affectingNatures", term1726);
        setField(term1680, term1680.getClass(), "characteristics", term1735);
        setField(term1739, term1739.getClass(), "name", "RDnkgWkcbz");
        setField(term1739, term1739.getClass(), "url", "IBpaxltauX");
        setField(term1680, term1680.getClass(), "moveDamageClass", term1739);
        setField(term1680, term1680.getClass(), "names", term1764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAffectingMoves", argTypes, term1680, args);
    }

};


