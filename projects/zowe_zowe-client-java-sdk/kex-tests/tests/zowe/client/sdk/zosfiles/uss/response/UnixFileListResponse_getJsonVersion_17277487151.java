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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class UnixFileListResponse_getJsonVersion_17277487151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586;

    public UnixFileListResponse_getJsonVersion_17277487151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term587 = new Integer(-1955890973);
        Integer term589 = new Integer(-2038273078);
        Integer term591 = new Integer(1227103734);
        Long term598 = new Long(-7115418542247301000L);
        Long term600 = new Long(8034714140377562739L);
        Long term603 = new Long(-2924531382671518368L);
        Object term595 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term595, term595.getClass(), "name", "");
        setField(term595, term595.getClass(), "mode", "");
        setField(term595, term595.getClass(), "size", term598);
        setField(term595, term595.getClass(), "uid", term600);
        setField(term595, term595.getClass(), "user", "");
        setField(term595, term595.getClass(), "gid", term603);
        setField(term595, term595.getClass(), "group", "");
        setField(term595, term595.getClass(), "mtime", "");
        setField(term595, term595.getClass(), "target", "");
        Long term611 = new Long(-3948863953565024517L);
        Long term613 = new Long(-6587807377747738663L);
        Long term616 = new Long(-6301101997917060727L);
        Object term608 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term608, term608.getClass(), "name", "");
        setField(term608, term608.getClass(), "mode", "");
        setField(term608, term608.getClass(), "size", term611);
        setField(term608, term608.getClass(), "uid", term613);
        setField(term608, term608.getClass(), "user", "");
        setField(term608, term608.getClass(), "gid", term616);
        setField(term608, term608.getClass(), "group", "");
        setField(term608, term608.getClass(), "mtime", "");
        setField(term608, term608.getClass(), "target", "");
        Long term624 = new Long(8166095254618543564L);
        Long term626 = new Long(-4598158870068953328L);
        Long term629 = new Long(138235087558060686L);
        Object term621 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term621, term621.getClass(), "name", "");
        setField(term621, term621.getClass(), "mode", "");
        setField(term621, term621.getClass(), "size", term624);
        setField(term621, term621.getClass(), "uid", term626);
        setField(term621, term621.getClass(), "user", "");
        setField(term621, term621.getClass(), "gid", term629);
        setField(term621, term621.getClass(), "group", "");
        setField(term621, term621.getClass(), "mtime", "");
        setField(term621, term621.getClass(), "target", "");
        Long term637 = new Long(5381386339318883012L);
        Long term639 = new Long(-1333707622307134180L);
        Long term642 = new Long(-4360569253593381888L);
        Object term634 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term634, term634.getClass(), "name", "");
        setField(term634, term634.getClass(), "mode", "");
        setField(term634, term634.getClass(), "size", term637);
        setField(term634, term634.getClass(), "uid", term639);
        setField(term634, term634.getClass(), "user", "");
        setField(term634, term634.getClass(), "gid", term642);
        setField(term634, term634.getClass(), "group", "");
        setField(term634, term634.getClass(), "mtime", "");
        setField(term634, term634.getClass(), "target", "");
        ArrayList term593 = new ArrayList();
        ((ArrayList) term593).add(term595);
        ((ArrayList) term593).add(term608);
        ((ArrayList) term593).add(term621);
        ((ArrayList) term593).add(term634);
        term586 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse"));
        setField(term586, term586.getClass(), "jsonVersion", term587);
        setField(term586, term586.getClass(), "returnedRows", term589);
        setField(term586, term586.getClass(), "totalRows", term591);
        setField(term586, term586.getClass(), "items", term593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJsonVersion", argTypes, term586, args);
    }

};


