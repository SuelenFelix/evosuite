package icu.samnyan.aqua.sega.diva.model.common.collection;

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
import static icu.samnyan.aqua.sega.diva.model.common.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class FestaCollection_getPvIds_17082357677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5612;

    public FestaCollection_getPvIds_17082357677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5783 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term5782 = ((Class) term5783).getDeclaredField((String) "PINK_FESTA");
        ((Field) term5782).setAccessible(true);
        Object enum14 = ((Field) term5782).get((Object) null);
        Class<? extends Object> term6065 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term6064 = ((Class) term6065).getDeclaredField((String) "UNDEFINED");
        ((Field) term6064).setAccessible(true);
        Object enum15 = ((Field) term6064).get((Object) null);
        Integer term5689 = new Integer(0);
        Integer term5691 = new Integer(1);
        Integer term5760 = new Integer(0);
        Integer term5762 = new Integer(1);
        term5612 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term5613 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term5693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5698 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5713 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term5764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5769 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5770 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5775 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term5613, term5613.getClass(), "id", -1);
        setBooleanField(term5613, term5613.getClass(), "enable", true);
        setField(term5613, term5613.getClass(), "name", "xxx");
        setField(term5613, term5613.getClass(), "kind", enum14);
        setField(term5613, term5613.getClass(), "difficulty", enum15);
        setField(term5613, term5613.getClass(), "pvList", "ALL");
        setField(term5613, term5613.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term5613, term5613.getClass(), "addVP", term5689);
        setField(term5613, term5613.getClass(), "vpMultiplier", term5691);
        setIntField(term5694, term5694.getClass(), "year", 2005);
        setShortField(term5694, term5694.getClass(), "month", (short) 1);
        setShortField(term5694, term5694.getClass(), "day", (short) 1);
        setField(term5693, term5693.getClass(), "date", term5694);
        setByteField(term5698, term5698.getClass(), "hour", (byte) 0);
        setByteField(term5698, term5698.getClass(), "minute", (byte) 0);
        setByteField(term5698, term5698.getClass(), "second", (byte) 0);
        setIntField(term5698, term5698.getClass(), "nano", 0);
        setField(term5693, term5693.getClass(), "time", term5698);
        setField(term5613, term5613.getClass(), "start", term5693);
        setIntField(term5704, term5704.getClass(), "year", 2005);
        setShortField(term5704, term5704.getClass(), "month", (short) 1);
        setShortField(term5704, term5704.getClass(), "day", (short) 1);
        setField(term5703, term5703.getClass(), "date", term5704);
        setField(term5703, term5703.getClass(), "time", term5698);
        setField(term5613, term5613.getClass(), "end", term5703);
        setIntField(term5709, term5709.getClass(), "year", 2005);
        setShortField(term5709, term5709.getClass(), "month", (short) 1);
        setShortField(term5709, term5709.getClass(), "day", (short) 1);
        setField(term5708, term5708.getClass(), "date", term5709);
        setField(term5708, term5708.getClass(), "time", term5698);
        setField(term5613, term5613.getClass(), "createDate", term5708);
        setField(term5612, term5612.getClass(), "firstFesta", term5613);
        setIntField(term5713, term5713.getClass(), "id", -1);
        setBooleanField(term5713, term5713.getClass(), "enable", true);
        setField(term5713, term5713.getClass(), "name", "xxx");
        setField(term5713, term5713.getClass(), "kind", enum14);
        setField(term5713, term5713.getClass(), "difficulty", enum15);
        setField(term5713, term5713.getClass(), "pvList", "ALL");
        setField(term5713, term5713.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term5713, term5713.getClass(), "addVP", term5760);
        setField(term5713, term5713.getClass(), "vpMultiplier", term5762);
        setIntField(term5765, term5765.getClass(), "year", 2005);
        setShortField(term5765, term5765.getClass(), "month", (short) 1);
        setShortField(term5765, term5765.getClass(), "day", (short) 1);
        setField(term5764, term5764.getClass(), "date", term5765);
        setField(term5764, term5764.getClass(), "time", term5698);
        setField(term5713, term5713.getClass(), "start", term5764);
        setIntField(term5770, term5770.getClass(), "year", 2005);
        setShortField(term5770, term5770.getClass(), "month", (short) 1);
        setShortField(term5770, term5770.getClass(), "day", (short) 1);
        setField(term5769, term5769.getClass(), "date", term5770);
        setField(term5769, term5769.getClass(), "time", term5698);
        setField(term5713, term5713.getClass(), "end", term5769);
        setIntField(term5775, term5775.getClass(), "year", 2005);
        setShortField(term5775, term5775.getClass(), "month", (short) 1);
        setShortField(term5775, term5775.getClass(), "day", (short) 1);
        setField(term5774, term5774.getClass(), "date", term5775);
        setField(term5774, term5774.getClass(), "time", term5698);
        setField(term5713, term5713.getClass(), "createDate", term5774);
        setField(term5612, term5612.getClass(), "secondFesta", term5713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvIds", argTypes, term5612, args);
    }

};


