package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class StageResultResponse_init_5511561571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8648;
     Object term8650;
     Object term8652;
     Object term8654;
     Object term8656;
     Object term8670;
     Object term8672;
     Object term8674;
     Object term8676;
     Object term8678;
     Object term8680;
     Object term8742;
     Object term8744;
     Object term8854;
     Object term8856;
     Object term8866;
     Object term8868;
     Object term8870;
     Object term8872;
     Object term8874;
     Object term8876;

    public StageResultResponse_init_5511561571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8648 = new Integer(1962444399);
        term8650 = new Integer(767834723);
        term8652 = new Integer(-602026508);
        term8654 = new Integer(-157887805);
        term8656 = new Integer(1876565163);
        term8670 = new Integer(-817164822);
        term8672 = new Integer(-1016503459);
        term8674 = new Integer(-1968847291);
        term8676 = new Integer(579005622);
        term8678 = new Integer(-14890619);
        term8680 = new Integer(1632125673);
        term8742 = new Integer(454281060);
        term8744 = new Integer(-1786399638);
        term8854 = new Integer(2055867847);
        term8856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8861 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8857, term8857.getClass(), "year", 2012);
        setShortField(term8857, term8857.getClass(), "month", (short) 8);
        setShortField(term8857, term8857.getClass(), "day", (short) 25);
        setField(term8856, term8856.getClass(), "date", term8857);
        setByteField(term8861, term8861.getClass(), "hour", (byte) 5);
        setByteField(term8861, term8861.getClass(), "minute", (byte) 20);
        setByteField(term8861, term8861.getClass(), "second", (byte) 50);
        setIntField(term8861, term8861.getClass(), "nano", 345595912);
        setField(term8856, term8856.getClass(), "time", term8861);
        term8866 = new Integer(-1048298087);
        term8868 = new Integer(292681826);
        term8870 = new Integer(458147407);
        term8872 = new Integer(-184153539);
        term8874 = new Integer(493620644);
        term8876 = new Integer(1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[47];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        argTypes[15] = Class.forName("java.lang.String");
        argTypes[16] = Class.forName("java.lang.String");
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.lang.String");
        argTypes[20] = int.class;
        argTypes[21] = int.class;
        argTypes[22] = Class.forName("java.lang.String");
        argTypes[23] = Class.forName("java.lang.String");
        argTypes[24] = Class.forName("java.lang.String");
        argTypes[25] = Class.forName("java.lang.String");
        argTypes[26] = Class.forName("java.lang.String");
        argTypes[27] = Class.forName("java.lang.String");
        argTypes[28] = Class.forName("java.lang.String");
        argTypes[29] = Class.forName("java.lang.String");
        argTypes[30] = Class.forName("java.lang.String");
        argTypes[31] = int.class;
        argTypes[32] = Class.forName("java.time.LocalDateTime");
        argTypes[33] = int.class;
        argTypes[34] = int.class;
        argTypes[35] = int.class;
        argTypes[36] = int.class;
        argTypes[37] = int.class;
        argTypes[38] = int.class;
        argTypes[39] = Class.forName("java.lang.String");
        argTypes[40] = Class.forName("java.lang.String");
        argTypes[41] = Class.forName("java.lang.String");
        argTypes[42] = Class.forName("java.lang.String");
        argTypes[43] = Class.forName("java.lang.String");
        argTypes[44] = Class.forName("java.lang.String");
        argTypes[45] = Class.forName("java.lang.String");
        argTypes[46] = Class.forName("java.lang.String");
        Object[] args = new Object[47];
        args[0] = "GVizqqzXpy";
        args[1] = "JqXGgAhZPl";
        args[2] = "jiKYgYHqIS";
        args[3] = term8648;
        args[4] = term8650;
        args[5] = term8652;
        args[6] = term8654;
        args[7] = term8656;
        args[8] = "DfISiziTgG";
        args[9] = term8670;
        args[10] = term8672;
        args[11] = term8674;
        args[12] = term8676;
        args[13] = term8678;
        args[14] = term8680;
        args[15] = "XqgfKFvPSD";
        args[16] = "JiVRgTZvKc";
        args[17] = "XPKmummaqg";
        args[18] = "BKLfkLiZTH";
        args[19] = "SPpkrGcPRr";
        args[20] = term8742;
        args[21] = term8744;
        args[22] = "sEccwbJKYE";
        args[23] = "AWRooQKkdW";
        args[24] = "vjxIhXHxGR";
        args[25] = "QXzGXbEXMu";
        args[26] = "qxSDVejjiY";
        args[27] = "xBsXSDjXYK";
        args[28] = "sEnIVFtZuQ";
        args[29] = "ZVecLZMLHF";
        args[30] = "fztQhjqwdP";
        args[31] = term8854;
        args[32] = term8856;
        args[33] = term8866;
        args[34] = term8868;
        args[35] = term8870;
        args[36] = term8872;
        args[37] = term8874;
        args[38] = term8876;
        args[39] = "eVpkWxjuki";
        args[40] = "SJiQaLvSKv";
        args[41] = "OEXDRUKcFl";
        args[42] = "RYdKCNNMBR";
        args[43] = "yGtHPyvYiQ";
        args[44] = "MvRIxilFMJ";
        args[45] = "iNwOJRBEjp";
        args[46] = "XylxrMBraH";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


