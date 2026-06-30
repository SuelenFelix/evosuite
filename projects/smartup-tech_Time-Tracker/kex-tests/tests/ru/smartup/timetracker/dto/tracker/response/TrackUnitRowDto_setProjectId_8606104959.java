package ru.smartup.timetracker.dto.tracker.response;

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
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TrackUnitRowDto_setProjectId_8606104959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4956;
     Object term5059;

    public TrackUnitRowDto_setProjectId_8606104959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4987 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4989 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4987, term4987.getClass(), "id", 7994303628307559416L);
        setLongField(term4989, term4989.getClass(), "fastTime", 1853963979281L);
        setField(term4989, term4989.getClass(), "cdate", null);
        setField(term4987, term4987.getClass(), "workDay", term4989);
        setFloatField(term4987, term4987.getClass(), "hours", 0.30926234F);
        setBooleanField(term4987, term4987.getClass(), "blocked", false);
        setBooleanField(term4987, term4987.getClass(), "billable", true);
        setField(term4987, term4987.getClass(), "comment", "");
        setField(term4987, term4987.getClass(), "rejectReason", "");
        setBooleanField(term4987, term4987.getClass(), "rejected", true);
        Object term4997 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4999 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4997, term4997.getClass(), "id", 2443640364875054177L);
        setLongField(term4999, term4999.getClass(), "fastTime", 1795936337628L);
        setField(term4999, term4999.getClass(), "cdate", null);
        setField(term4997, term4997.getClass(), "workDay", term4999);
        setFloatField(term4997, term4997.getClass(), "hours", 0.37161416F);
        setBooleanField(term4997, term4997.getClass(), "blocked", true);
        setBooleanField(term4997, term4997.getClass(), "billable", false);
        setField(term4997, term4997.getClass(), "comment", "");
        setField(term4997, term4997.getClass(), "rejectReason", "");
        setBooleanField(term4997, term4997.getClass(), "rejected", true);
        Object term5007 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5009 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5007, term5007.getClass(), "id", -1610676979013636850L);
        setLongField(term5009, term5009.getClass(), "fastTime", 1802995433545L);
        setField(term5009, term5009.getClass(), "cdate", null);
        setField(term5007, term5007.getClass(), "workDay", term5009);
        setFloatField(term5007, term5007.getClass(), "hours", 0.022591352F);
        setBooleanField(term5007, term5007.getClass(), "blocked", false);
        setBooleanField(term5007, term5007.getClass(), "billable", true);
        setField(term5007, term5007.getClass(), "comment", "");
        setField(term5007, term5007.getClass(), "rejectReason", "");
        setBooleanField(term5007, term5007.getClass(), "rejected", false);
        Object term5017 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5019 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5017, term5017.getClass(), "id", 2062173786000223358L);
        setLongField(term5019, term5019.getClass(), "fastTime", 1843214817357L);
        setField(term5019, term5019.getClass(), "cdate", null);
        setField(term5017, term5017.getClass(), "workDay", term5019);
        setFloatField(term5017, term5017.getClass(), "hours", 0.6805867F);
        setBooleanField(term5017, term5017.getClass(), "blocked", false);
        setBooleanField(term5017, term5017.getClass(), "billable", true);
        setField(term5017, term5017.getClass(), "comment", "");
        setField(term5017, term5017.getClass(), "rejectReason", "");
        setBooleanField(term5017, term5017.getClass(), "rejected", true);
        Object term5027 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5029 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5027, term5027.getClass(), "id", -8658027316505137504L);
        setLongField(term5029, term5029.getClass(), "fastTime", 1628695316832L);
        setField(term5029, term5029.getClass(), "cdate", null);
        setField(term5027, term5027.getClass(), "workDay", term5029);
        setFloatField(term5027, term5027.getClass(), "hours", 0.51208574F);
        setBooleanField(term5027, term5027.getClass(), "blocked", true);
        setBooleanField(term5027, term5027.getClass(), "billable", true);
        setField(term5027, term5027.getClass(), "comment", "");
        setField(term5027, term5027.getClass(), "rejectReason", "");
        setBooleanField(term5027, term5027.getClass(), "rejected", false);
        Object term5037 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5039 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5037, term5037.getClass(), "id", 414749984815662075L);
        setLongField(term5039, term5039.getClass(), "fastTime", 1393200035243L);
        setField(term5039, term5039.getClass(), "cdate", null);
        setField(term5037, term5037.getClass(), "workDay", term5039);
        setFloatField(term5037, term5037.getClass(), "hours", 0.28528106F);
        setBooleanField(term5037, term5037.getClass(), "blocked", false);
        setBooleanField(term5037, term5037.getClass(), "billable", false);
        setField(term5037, term5037.getClass(), "comment", "");
        setField(term5037, term5037.getClass(), "rejectReason", "");
        setBooleanField(term5037, term5037.getClass(), "rejected", false);
        Object term5047 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5049 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5047, term5047.getClass(), "id", 463622836963501975L);
        setLongField(term5049, term5049.getClass(), "fastTime", 1762147441299L);
        setField(term5049, term5049.getClass(), "cdate", null);
        setField(term5047, term5047.getClass(), "workDay", term5049);
        setFloatField(term5047, term5047.getClass(), "hours", 0.30827713F);
        setBooleanField(term5047, term5047.getClass(), "blocked", false);
        setBooleanField(term5047, term5047.getClass(), "billable", true);
        setField(term5047, term5047.getClass(), "comment", "");
        setField(term5047, term5047.getClass(), "rejectReason", "");
        setBooleanField(term5047, term5047.getClass(), "rejected", true);
        ArrayList term4985 = new ArrayList();
        ((ArrayList) term4985).add(term4987);
        ((ArrayList) term4985).add(term4997);
        ((ArrayList) term4985).add(term5007);
        ((ArrayList) term4985).add(term5017);
        ((ArrayList) term4985).add(term5027);
        ((ArrayList) term4985).add(term5037);
        ((ArrayList) term4985).add(term5047);
        term4956 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term4956, term4956.getClass(), "employeeId", -1456670397);
        setIntField(term4956, term4956.getClass(), "projectId", 1622346318);
        setField(term4956, term4956.getClass(), "projectName", "dpNsDgfPso");
        setLongField(term4956, term4956.getClass(), "taskId", 5953383087795962419L);
        setField(term4956, term4956.getClass(), "taskName", "hCWPJQKpdc");
        setBooleanField(term4956, term4956.getClass(), "observed", true);
        setField(term4956, term4956.getClass(), "units", term4985);
        term5059 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5059;
        callMethod(klass, "setProjectId", argTypes, term4956, args);
    }

};


