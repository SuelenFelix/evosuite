package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PreStartResponse_getSldrtchseeqp_22271652121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267523;

    public PreStartResponse_getSldrtchseeqp_22271652121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term267675 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term267674 = ((Class) term267675).getDeclaredField((String) "SUCCESS");
        ((Field) term267674).setAccessible(true);
        Object enum638 = ((Field) term267674).get((Object) null);
        Integer term267536 = new Integer(1768204942);
        Integer term267538 = new Integer(1252951645);
        Integer term267540 = new Integer(574481092);
        Integer term267542 = new Integer(-310528004);
        Integer term267544 = new Integer(-634976996);
        Class<? extends Object> term267983 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term267982 = ((Class) term267983).getDeclaredField((String) "MY_LIST_B");
        ((Field) term267982).setAccessible(true);
        Object enum639 = ((Field) term267982).get((Object) null);
        Integer term267572 = new Integer(-1015274146);
        Integer term267574 = new Integer(-49052672);
        Integer term267588 = new Integer(339372704);
        Integer term267590 = new Integer(-851097944);
        Integer term267614 = new Integer(803925431);
        Integer term267616 = new Integer(76929641);
        Integer term267618 = new Integer(-2003192918);
        Integer term267620 = new Integer(-1362856620);
        Integer term267622 = new Integer(-1835839814);
        Integer term267624 = new Integer(-1404350380);
        Class<? extends Object> term268277 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term268276 = ((Class) term268277).getDeclaredField((String) "REISSUE");
        ((Field) term268276).setAccessible(true);
        Object enum640 = ((Field) term268276).get((Object) null);
        term267523 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term267604 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term267605 = newInstance(Class.forName("java.time.LocalDate"));
        Object term267609 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term267523, term267523.getClass(), "ps_result", enum638);
        setField(term267523, term267523.getClass(), "accept_idx", term267536);
        setField(term267523, term267523.getClass(), "nblss_ltt_stts", term267538);
        setField(term267523, term267523.getClass(), "nblss_ltt_tckt", term267540);
        setField(term267523, term267523.getClass(), "nblss_ltt_is_opn", term267542);
        setField(term267523, term267523.getClass(), "pd_id", term267544);
        setField(term267523, term267523.getClass(), "player_name", "KxEBqnheIv");
        setField(term267523, term267523.getClass(), "sort_kind", enum639);
        setField(term267523, term267523.getClass(), "lv_num", term267572);
        setField(term267523, term267523.getClass(), "lv_pnt", term267574);
        setField(term267523, term267523.getClass(), "lv_str", "ExgxdQmpcx");
        setField(term267523, term267523.getClass(), "lv_efct_id", term267588);
        setField(term267523, term267523.getClass(), "lv_plt_id", term267590);
        setField(term267523, term267523.getClass(), "mdl_eqp_ary", "SUwVfgXZzs");
        setIntField(term267605, term267605.getClass(), "year", 2023);
        setShortField(term267605, term267605.getClass(), "month", (short) 11);
        setShortField(term267605, term267605.getClass(), "day", (short) 14);
        setField(term267604, term267604.getClass(), "date", term267605);
        setByteField(term267609, term267609.getClass(), "hour", (byte) 15);
        setByteField(term267609, term267609.getClass(), "minute", (byte) 2);
        setByteField(term267609, term267609.getClass(), "second", (byte) 47);
        setIntField(term267609, term267609.getClass(), "nano", 703984770);
        setField(term267604, term267604.getClass(), "time", term267609);
        setField(term267523, term267523.getClass(), "mdl_eqp_tm", term267604);
        setField(term267523, term267523.getClass(), "skn_eqp", term267614);
        setField(term267523, term267523.getClass(), "btn_se_eqp", term267616);
        setField(term267523, term267523.getClass(), "sld_se_eqp", term267618);
        setField(term267523, term267523.getClass(), "chn_sld_se_eqp", term267620);
        setField(term267523, term267523.getClass(), "sldr_tch_se_eqp", term267622);
        setField(term267523, term267523.getClass(), "vcld_pts", term267624);
        setField(term267523, term267523.getClass(), "passwd_stat", enum640);
        setField(term267523, term267523.getClass(), "cmd", "OzwvrniiKl");
        setField(term267523, term267523.getClass(), "req_id", "beAkHVBeEQ");
        setField(term267523, term267523.getClass(), "stat", "tiGVUUaQMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSldr_tch_se_eqp", argTypes, term267523, args);
    }

};


