package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;

public class GetUserPreviewResp_init_193052881646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31617;
     Object term31631;
     Object term31693;
     Object term31695;
     Object term31697;
     Object term31699;
     Object term31701;
     Object term31703;
     Object term31705;
     Object term31707;
     Object term31709;
     Object term31723;
     Object term31725;
     Object term31727;

    public GetUserPreviewResp_init_193052881646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31617 = new Long(-5735822732056753596L);
        term31631 = new Boolean(true);
        term31693 = new Integer(-1573368178);
        term31695 = new Integer(-1007994686);
        term31697 = new Integer(-849828336);
        term31699 = new Integer(184687223);
        term31701 = new Integer(1768023420);
        term31703 = new Integer(-409163006);
        term31705 = new Integer(1632107117);
        term31707 = new Integer(-351038803);
        term31709 = new Integer(1899735308);
        term31723 = new Integer(-1204343453);
        term31725 = new Boolean(false);
        term31727 = new Integer(1796650051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[21];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        argTypes[15] = int.class;
        argTypes[16] = int.class;
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = int.class;
        argTypes[19] = boolean.class;
        argTypes[20] = int.class;
        Object[] args = new Object[21];
        args[0] = term31617;
        args[1] = "mEYsXJvgdv";
        args[2] = term31631;
        args[3] = "JKbmIUKwNm";
        args[4] = "rftaOUctkN";
        args[5] = "BqodsrSZso";
        args[6] = "APQYHLBKit";
        args[7] = "tIucnzigbY";
        args[8] = term31693;
        args[9] = term31695;
        args[10] = term31697;
        args[11] = term31699;
        args[12] = term31701;
        args[13] = term31703;
        args[14] = term31705;
        args[15] = term31707;
        args[16] = term31709;
        args[17] = "SMZbMLuReo";
        args[18] = term31723;
        args[19] = term31725;
        args[20] = term31727;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


