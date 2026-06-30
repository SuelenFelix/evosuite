package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;

public class ProfileResp_init_34619270572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122601;
     Object term122615;
     Object term122617;
     Object term122619;
     Object term122621;
     Object term122623;
     Object term122625;
     Object term122627;
     Object term122629;
     Object term122631;
     Object term122633;
     Object term122635;
     Object term122637;
     Object term122639;
     Object term122641;
     Object term122643;
     Object term122645;
     Object term122647;
     Object term122649;
     Object term122659;
     Object term122669;
     Object term122671;
     Object term122673;
     Object term122675;
     Object term122677;
     Object term122679;
     Object term122681;
     Object term122683;
     Object term122685;
     Object term122687;
     Object term122689;
     Object term122691;

    public ProfileResp_init_34619270572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122601 = new Integer(1329601369);
        term122615 = new Long(6653419355055110955L);
        term122617 = new Long(2927460958159387652L);
        term122619 = new Integer(45491930);
        term122621 = new Integer(-1386170395);
        term122623 = new Integer(-1755122899);
        term122625 = new Integer(-1726134606);
        term122627 = new Integer(69423994);
        term122629 = new Integer(-679170288);
        term122631 = new Integer(-145991851);
        term122633 = new Integer(98056508);
        term122635 = new Long(-8974647646643503706L);
        term122637 = new Long(3578386851701281032L);
        term122639 = new Long(5767384862412441914L);
        term122641 = new Long(623442675398489183L);
        term122643 = new Long(-6054733688650022090L);
        term122645 = new Long(1507754414072122752L);
        term122647 = new Integer(-1911518024);
        term122649 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122650 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122654 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term122650, term122650.getClass(), "year", 2027);
        setShortField(term122650, term122650.getClass(), "month", (short) 5);
        setShortField(term122650, term122650.getClass(), "day", (short) 30);
        setField(term122649, term122649.getClass(), "date", term122650);
        setByteField(term122654, term122654.getClass(), "hour", (byte) 22);
        setByteField(term122654, term122654.getClass(), "minute", (byte) 38);
        setByteField(term122654, term122654.getClass(), "second", (byte) 13);
        setIntField(term122654, term122654.getClass(), "nano", 350383121);
        setField(term122649, term122649.getClass(), "time", term122654);
        term122659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122664 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term122660, term122660.getClass(), "year", 2025);
        setShortField(term122660, term122660.getClass(), "month", (short) 7);
        setShortField(term122660, term122660.getClass(), "day", (short) 27);
        setField(term122659, term122659.getClass(), "date", term122660);
        setByteField(term122664, term122664.getClass(), "hour", (byte) 19);
        setByteField(term122664, term122664.getClass(), "minute", (byte) 40);
        setByteField(term122664, term122664.getClass(), "second", (byte) 29);
        setIntField(term122664, term122664.getClass(), "nano", 438384994);
        setField(term122659, term122659.getClass(), "time", term122664);
        term122669 = new Integer(146245253);
        term122671 = new Integer(-122623710);
        term122673 = new Integer(-1081669057);
        term122675 = new Integer(1189315732);
        term122677 = new Integer(-893581954);
        term122679 = new Integer(-1260375079);
        term122681 = new Integer(1152789226);
        term122683 = new Integer(1183748538);
        term122685 = new Integer(211748144);
        term122687 = new Integer(-887098604);
        term122689 = new Integer(710627792);
        term122691 = new Integer(-1854330908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[34];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = long.class;
        argTypes[4] = long.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        argTypes[12] = int.class;
        argTypes[13] = long.class;
        argTypes[14] = long.class;
        argTypes[15] = long.class;
        argTypes[16] = long.class;
        argTypes[17] = long.class;
        argTypes[18] = long.class;
        argTypes[19] = int.class;
        argTypes[20] = Class.forName("java.time.LocalDateTime");
        argTypes[21] = Class.forName("java.time.LocalDateTime");
        argTypes[22] = int.class;
        argTypes[23] = int.class;
        argTypes[24] = int.class;
        argTypes[25] = int.class;
        argTypes[26] = int.class;
        argTypes[27] = int.class;
        argTypes[28] = int.class;
        argTypes[29] = int.class;
        argTypes[30] = int.class;
        argTypes[31] = int.class;
        argTypes[32] = int.class;
        argTypes[33] = int.class;
        Object[] args = new Object[34];
        args[0] = "NpRJptUmML";
        args[1] = term122601;
        args[2] = "UNUfwYHgBp";
        args[3] = term122615;
        args[4] = term122617;
        args[5] = term122619;
        args[6] = term122621;
        args[7] = term122623;
        args[8] = term122625;
        args[9] = term122627;
        args[10] = term122629;
        args[11] = term122631;
        args[12] = term122633;
        args[13] = term122635;
        args[14] = term122637;
        args[15] = term122639;
        args[16] = term122641;
        args[17] = term122643;
        args[18] = term122645;
        args[19] = term122647;
        args[20] = term122649;
        args[21] = term122659;
        args[22] = term122669;
        args[23] = term122671;
        args[24] = term122673;
        args[25] = term122675;
        args[26] = term122677;
        args[27] = term122679;
        args[28] = term122681;
        args[29] = term122683;
        args[30] = term122685;
        args[31] = term122687;
        args[32] = term122689;
        args[33] = term122691;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


