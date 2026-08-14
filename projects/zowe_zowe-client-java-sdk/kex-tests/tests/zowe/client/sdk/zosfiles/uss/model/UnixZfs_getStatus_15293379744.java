package zowe.client.sdk.zosfiles.uss.model;

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
import static zowe.client.sdk.zosfiles.uss.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UnixZfs_getStatus_15293379744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;

    public UnixZfs_getStatus_15293379744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term721 = new Long(4178434741742309755L);
        Long term723 = new Long(-2068172595987555756L);
        Long term725 = new Long(-6292278961887936280L);
        Long term727 = new Long(-6645965768855543712L);
        Long term729 = new Long(4784595517102746672L);
        Long term743 = new Long(-7612550318181586304L);
        Long term745 = new Long(-2170847986967241072L);
        Long term747 = new Long(4044358158040652353L);
        Long term749 = new Long(-4443169559037975007L);
        Long term751 = new Long(-3842548265506930260L);
        term660 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term660, term660.getClass(), "name", "IoAlmYsBwc");
        setField(term660, term660.getClass(), "mountpoint", "TEParAifyi");
        setField(term660, term660.getClass(), "fstname", "OWDIEULEFu");
        setField(term660, term660.getClass(), "status", "dWRymuLBtr");
        setField(term660, term660.getClass(), "mode", "AijpHYOFuy");
        setField(term660, term660.getClass(), "dev", term721);
        setField(term660, term660.getClass(), "fstype", term723);
        setField(term660, term660.getClass(), "bsize", term725);
        setField(term660, term660.getClass(), "bavail", term727);
        setField(term660, term660.getClass(), "blocks", term729);
        setField(term660, term660.getClass(), "sysname", "SbAoxhfrkn");
        setField(term660, term660.getClass(), "readibc", term743);
        setField(term660, term660.getClass(), "writeibc", term745);
        setField(term660, term660.getClass(), "diribc", term747);
        setField(term660, term660.getClass(), "returnedRows", term749);
        setField(term660, term660.getClass(), "totalRows", term751);
        setBooleanField(term660, term660.getClass(), "moreRows", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term660, args);
    }

};


