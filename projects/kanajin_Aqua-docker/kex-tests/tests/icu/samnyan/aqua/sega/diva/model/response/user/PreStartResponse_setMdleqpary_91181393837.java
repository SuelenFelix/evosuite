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

public class PreStartResponse_setMdleqpary_91181393837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285247;

    public PreStartResponse_setMdleqpary_91181393837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term285418 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term285417 = ((Class) term285418).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term285417).setAccessible(true);
        Object enum688 = ((Field) term285417).get((Object) null);
        Integer term285268 = new Integer(-1271375703);
        Integer term285270 = new Integer(1136208236);
        Integer term285272 = new Integer(-1220630391);
        Integer term285274 = new Integer(-995822131);
        Integer term285276 = new Integer(-687282231);
        Class<? extends Object> term285750 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term285749 = ((Class) term285750).getDeclaredField((String) "COMPLEXITY");
        ((Field) term285749).setAccessible(true);
        Object enum689 = ((Field) term285749).get((Object) null);
        Integer term285305 = new Integer(1200440315);
        Integer term285307 = new Integer(40571662);
        Integer term285321 = new Integer(1863910269);
        Integer term285323 = new Integer(864645689);
        Integer term285347 = new Integer(279384872);
        Integer term285349 = new Integer(1427305953);
        Integer term285351 = new Integer(-781832877);
        Integer term285353 = new Integer(797203987);
        Integer term285355 = new Integer(1973060703);
        Integer term285357 = new Integer(-138239905);
        Class<? extends Object> term286047 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term286046 = ((Class) term286047).getDeclaredField((String) "RESET");
        ((Field) term286046).setAccessible(true);
        Object enum690 = ((Field) term286046).get((Object) null);
        term285247 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term285337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285342 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term285247, term285247.getClass(), "ps_result", enum688);
        setField(term285247, term285247.getClass(), "accept_idx", term285268);
        setField(term285247, term285247.getClass(), "nblss_ltt_stts", term285270);
        setField(term285247, term285247.getClass(), "nblss_ltt_tckt", term285272);
        setField(term285247, term285247.getClass(), "nblss_ltt_is_opn", term285274);
        setField(term285247, term285247.getClass(), "pd_id", term285276);
        setField(term285247, term285247.getClass(), "player_name", "pLrycUApoJ");
        setField(term285247, term285247.getClass(), "sort_kind", enum689);
        setField(term285247, term285247.getClass(), "lv_num", term285305);
        setField(term285247, term285247.getClass(), "lv_pnt", term285307);
        setField(term285247, term285247.getClass(), "lv_str", "QJTDOLXoVI");
        setField(term285247, term285247.getClass(), "lv_efct_id", term285321);
        setField(term285247, term285247.getClass(), "lv_plt_id", term285323);
        setField(term285247, term285247.getClass(), "mdl_eqp_ary", "MVXNdXioDJ");
        setIntField(term285338, term285338.getClass(), "year", 2026);
        setShortField(term285338, term285338.getClass(), "month", (short) 9);
        setShortField(term285338, term285338.getClass(), "day", (short) 18);
        setField(term285337, term285337.getClass(), "date", term285338);
        setByteField(term285342, term285342.getClass(), "hour", (byte) 14);
        setByteField(term285342, term285342.getClass(), "minute", (byte) 51);
        setByteField(term285342, term285342.getClass(), "second", (byte) 41);
        setIntField(term285342, term285342.getClass(), "nano", 830322169);
        setField(term285337, term285337.getClass(), "time", term285342);
        setField(term285247, term285247.getClass(), "mdl_eqp_tm", term285337);
        setField(term285247, term285247.getClass(), "skn_eqp", term285347);
        setField(term285247, term285247.getClass(), "btn_se_eqp", term285349);
        setField(term285247, term285247.getClass(), "sld_se_eqp", term285351);
        setField(term285247, term285247.getClass(), "chn_sld_se_eqp", term285353);
        setField(term285247, term285247.getClass(), "sldr_tch_se_eqp", term285355);
        setField(term285247, term285247.getClass(), "vcld_pts", term285357);
        setField(term285247, term285247.getClass(), "passwd_stat", enum690);
        setField(term285247, term285247.getClass(), "cmd", "xXscNmBGLP");
        setField(term285247, term285247.getClass(), "req_id", "DOvWosNzCd");
        setField(term285247, term285247.getClass(), "stat", "bIZNWEzBTe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CVhsNqYDrO";
        callMethod(klass, "setMdl_eqp_ary", argTypes, term285247, args);
    }

};


