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

public class UnixFileListResponse_toString_12433741745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;

    public UnixFileListResponse_toString_12433741745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term800 = new Integer(1622346318);
        Integer term802 = new Integer(1048535127);
        Integer term804 = new Integer(-655067527);
        Long term811 = new Long(-78240609295693193L);
        Long term813 = new Long(3090901538358721367L);
        Long term816 = new Long(-1677189124507026637L);
        Object term808 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term808, term808.getClass(), "name", "");
        setField(term808, term808.getClass(), "mode", "");
        setField(term808, term808.getClass(), "size", term811);
        setField(term808, term808.getClass(), "uid", term813);
        setField(term808, term808.getClass(), "user", "");
        setField(term808, term808.getClass(), "gid", term816);
        setField(term808, term808.getClass(), "group", "");
        setField(term808, term808.getClass(), "mtime", "");
        setField(term808, term808.getClass(), "target", "");
        Long term824 = new Long(4795660804170399986L);
        Long term826 = new Long(-4030863184426321096L);
        Long term829 = new Long(-8010214112439224349L);
        Object term821 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term821, term821.getClass(), "name", "");
        setField(term821, term821.getClass(), "mode", "");
        setField(term821, term821.getClass(), "size", term824);
        setField(term821, term821.getClass(), "uid", term826);
        setField(term821, term821.getClass(), "user", "");
        setField(term821, term821.getClass(), "gid", term829);
        setField(term821, term821.getClass(), "group", "");
        setField(term821, term821.getClass(), "mtime", "");
        setField(term821, term821.getClass(), "target", "");
        Long term837 = new Long(-6673920710396545553L);
        Long term839 = new Long(3412644969878030772L);
        Long term842 = new Long(6698455537431331246L);
        Object term834 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term834, term834.getClass(), "name", "");
        setField(term834, term834.getClass(), "mode", "");
        setField(term834, term834.getClass(), "size", term837);
        setField(term834, term834.getClass(), "uid", term839);
        setField(term834, term834.getClass(), "user", "");
        setField(term834, term834.getClass(), "gid", term842);
        setField(term834, term834.getClass(), "group", "");
        setField(term834, term834.getClass(), "mtime", "");
        setField(term834, term834.getClass(), "target", "");
        Long term850 = new Long(-8327432141027603933L);
        Long term852 = new Long(-433040798405298080L);
        Long term855 = new Long(-1505191021111100819L);
        Object term847 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term847, term847.getClass(), "name", "");
        setField(term847, term847.getClass(), "mode", "");
        setField(term847, term847.getClass(), "size", term850);
        setField(term847, term847.getClass(), "uid", term852);
        setField(term847, term847.getClass(), "user", "");
        setField(term847, term847.getClass(), "gid", term855);
        setField(term847, term847.getClass(), "group", "");
        setField(term847, term847.getClass(), "mtime", "");
        setField(term847, term847.getClass(), "target", "");
        Long term863 = new Long(-1000830646340880796L);
        Long term865 = new Long(5973526439563541711L);
        Long term868 = new Long(5246058710498845622L);
        Object term860 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term860, term860.getClass(), "name", "");
        setField(term860, term860.getClass(), "mode", "");
        setField(term860, term860.getClass(), "size", term863);
        setField(term860, term860.getClass(), "uid", term865);
        setField(term860, term860.getClass(), "user", "");
        setField(term860, term860.getClass(), "gid", term868);
        setField(term860, term860.getClass(), "group", "");
        setField(term860, term860.getClass(), "mtime", "");
        setField(term860, term860.getClass(), "target", "");
        Long term876 = new Long(4394651392080968777L);
        Long term878 = new Long(-7310273014364148916L);
        Long term881 = new Long(8863790908271299748L);
        Object term873 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term873, term873.getClass(), "name", "");
        setField(term873, term873.getClass(), "mode", "");
        setField(term873, term873.getClass(), "size", term876);
        setField(term873, term873.getClass(), "uid", term878);
        setField(term873, term873.getClass(), "user", "");
        setField(term873, term873.getClass(), "gid", term881);
        setField(term873, term873.getClass(), "group", "");
        setField(term873, term873.getClass(), "mtime", "");
        setField(term873, term873.getClass(), "target", "");
        ArrayList term806 = new ArrayList();
        ((ArrayList) term806).add(term808);
        ((ArrayList) term806).add(term821);
        ((ArrayList) term806).add(term834);
        ((ArrayList) term806).add(term847);
        ((ArrayList) term806).add(term860);
        ((ArrayList) term806).add(term873);
        term799 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse"));
        setField(term799, term799.getClass(), "jsonVersion", term800);
        setField(term799, term799.getClass(), "returnedRows", term802);
        setField(term799, term799.getClass(), "totalRows", term804);
        setField(term799, term799.getClass(), "items", term806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term799, args);
    }

};


