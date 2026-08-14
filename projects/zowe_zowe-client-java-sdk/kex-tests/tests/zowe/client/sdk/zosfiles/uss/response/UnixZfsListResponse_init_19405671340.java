package zowe.client.sdk.zosfiles.uss.response;

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
import static zowe.client.sdk.zosfiles.uss.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class UnixZfsListResponse_init_19405671340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;

    public UnixZfsListResponse_init_19405671340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        Long term67 = new Long(2442117782898005296L);
        Long term69 = new Long(6375119433582206027L);
        Long term71 = new Long(-8257434502486459194L);
        Long term73 = new Long(-8400487765614892086L);
        Long term75 = new Long(5270370404989704783L);
        Long term89 = new Long(7411271909051562686L);
        Long term91 = new Long(4872422362414183754L);
        Long term93 = new Long(6811161968424632369L);
        Long term95 = new Long(-7237588299778557629L);
        Long term97 = new Long(6967924379644551255L);
        Object term6 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term6, term6.getClass(), "name", "PAEBtnZtTD");
        setField(term6, term6.getClass(), "mountpoint", "sjlJAEtRrb");
        setField(term6, term6.getClass(), "fstname", "MuLcgQHgqz");
        setField(term6, term6.getClass(), "status", "xxtlPwDYFs");
        setField(term6, term6.getClass(), "mode", "jJCZpVmanW");
        setField(term6, term6.getClass(), "dev", term67);
        setField(term6, term6.getClass(), "fstype", term69);
        setField(term6, term6.getClass(), "bsize", term71);
        setField(term6, term6.getClass(), "bavail", term73);
        setField(term6, term6.getClass(), "blocks", term75);
        setField(term6, term6.getClass(), "sysname", "EGtDIRbSSb");
        setField(term6, term6.getClass(), "readibc", term89);
        setField(term6, term6.getClass(), "writeibc", term91);
        setField(term6, term6.getClass(), "diribc", term93);
        setField(term6, term6.getClass(), "returnedRows", term95);
        setField(term6, term6.getClass(), "totalRows", term97);
        setBooleanField(term6, term6.getClass(), "moreRows", false);
        Long term107 = new Long(-2813493605142626659L);
        Long term109 = new Long(-8885298608300233488L);
        Long term111 = new Long(-4325723315152823407L);
        Long term113 = new Long(2535595959091595249L);
        Long term115 = new Long(-5476826692763582090L);
        Long term118 = new Long(-872011222785455006L);
        Long term120 = new Long(-316468845751588286L);
        Long term122 = new Long(5127676408959197577L);
        Long term124 = new Long(-6573104506744284592L);
        Long term126 = new Long(-4920224193275732920L);
        Object term101 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term101, term101.getClass(), "name", "");
        setField(term101, term101.getClass(), "mountpoint", "");
        setField(term101, term101.getClass(), "fstname", "");
        setField(term101, term101.getClass(), "status", "");
        setField(term101, term101.getClass(), "mode", "");
        setField(term101, term101.getClass(), "dev", term107);
        setField(term101, term101.getClass(), "fstype", term109);
        setField(term101, term101.getClass(), "bsize", term111);
        setField(term101, term101.getClass(), "bavail", term113);
        setField(term101, term101.getClass(), "blocks", term115);
        setField(term101, term101.getClass(), "sysname", "");
        setField(term101, term101.getClass(), "readibc", term118);
        setField(term101, term101.getClass(), "writeibc", term120);
        setField(term101, term101.getClass(), "diribc", term122);
        setField(term101, term101.getClass(), "returnedRows", term124);
        setField(term101, term101.getClass(), "totalRows", term126);
        setBooleanField(term101, term101.getClass(), "moreRows", false);
        Long term131 = new Long(8428634514691209827L);
        Long term133 = new Long(-2585684163342970173L);
        Long term135 = new Long(8059786003080744426L);
        Long term137 = new Long(-4365849114644724155L);
        Long term139 = new Long(2486810210675247493L);
        Long term141 = new Long(7009926388951271268L);
        Long term143 = new Long(-7672528020740371001L);
        Long term145 = new Long(-4502405999831680926L);
        Long term147 = new Long(1967728129628047933L);
        Long term149 = new Long(2120084523938730454L);
        Object term130 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term130, term130.getClass(), "name", null);
        setField(term130, term130.getClass(), "mountpoint", null);
        setField(term130, term130.getClass(), "fstname", null);
        setField(term130, term130.getClass(), "status", null);
        setField(term130, term130.getClass(), "mode", null);
        setField(term130, term130.getClass(), "dev", term131);
        setField(term130, term130.getClass(), "fstype", term133);
        setField(term130, term130.getClass(), "bsize", term135);
        setField(term130, term130.getClass(), "bavail", term137);
        setField(term130, term130.getClass(), "blocks", term139);
        setField(term130, term130.getClass(), "sysname", null);
        setField(term130, term130.getClass(), "readibc", term141);
        setField(term130, term130.getClass(), "writeibc", term143);
        setField(term130, term130.getClass(), "diribc", term145);
        setField(term130, term130.getClass(), "returnedRows", term147);
        setField(term130, term130.getClass(), "totalRows", term149);
        setBooleanField(term130, term130.getClass(), "moreRows", false);
        term3 = new LinkedList();
        ((LinkedList) term3).add(term6);
        ((LinkedList) term3).add(term101);
        ((LinkedList) term3).add(term130);
        ((LinkedList) term3).add((Object)null);
        ((LinkedList) term3).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixZfsListResponse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term3;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


