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

public class PreStartResponse_getLvpltid_199099261914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260094;

    public PreStartResponse_getLvpltid_199099261914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term260251 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term260250 = ((Class) term260251).getDeclaredField((String) "CARD_TOO_NEW");
        ((Field) term260250).setAccessible(true);
        Object enum617 = ((Field) term260250).get((Object) null);
        Integer term260112 = new Integer(497269071);
        Integer term260114 = new Integer(-1899301124);
        Integer term260116 = new Integer(-1882480155);
        Integer term260118 = new Integer(-1410220680);
        Integer term260120 = new Integer(389427431);
        Class<? extends Object> term260574 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term260573 = ((Class) term260574).getDeclaredField((String) "MY_LIST_A");
        ((Field) term260573).setAccessible(true);
        Object enum618 = ((Field) term260573).get((Object) null);
        Integer term260148 = new Integer(-1945706126);
        Integer term260150 = new Integer(1152356969);
        Integer term260164 = new Integer(-1667990367);
        Integer term260166 = new Integer(-1214628358);
        Integer term260190 = new Integer(1102721075);
        Integer term260192 = new Integer(-426764678);
        Integer term260194 = new Integer(-1222614956);
        Integer term260196 = new Integer(-1870495012);
        Integer term260198 = new Integer(-1310015129);
        Integer term260200 = new Integer(-2104981311);
        Class<? extends Object> term260868 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term260867 = ((Class) term260868).getDeclaredField((String) "REISSUE");
        ((Field) term260867).setAccessible(true);
        Object enum619 = ((Field) term260867).get((Object) null);
        term260094 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term260180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260185 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term260094, term260094.getClass(), "ps_result", enum617);
        setField(term260094, term260094.getClass(), "accept_idx", term260112);
        setField(term260094, term260094.getClass(), "nblss_ltt_stts", term260114);
        setField(term260094, term260094.getClass(), "nblss_ltt_tckt", term260116);
        setField(term260094, term260094.getClass(), "nblss_ltt_is_opn", term260118);
        setField(term260094, term260094.getClass(), "pd_id", term260120);
        setField(term260094, term260094.getClass(), "player_name", "EFsPqsIRQv");
        setField(term260094, term260094.getClass(), "sort_kind", enum618);
        setField(term260094, term260094.getClass(), "lv_num", term260148);
        setField(term260094, term260094.getClass(), "lv_pnt", term260150);
        setField(term260094, term260094.getClass(), "lv_str", "SLJrzKBPdq");
        setField(term260094, term260094.getClass(), "lv_efct_id", term260164);
        setField(term260094, term260094.getClass(), "lv_plt_id", term260166);
        setField(term260094, term260094.getClass(), "mdl_eqp_ary", "TanVvFPLln");
        setIntField(term260181, term260181.getClass(), "year", 2010);
        setShortField(term260181, term260181.getClass(), "month", (short) 12);
        setShortField(term260181, term260181.getClass(), "day", (short) 30);
        setField(term260180, term260180.getClass(), "date", term260181);
        setByteField(term260185, term260185.getClass(), "hour", (byte) 17);
        setByteField(term260185, term260185.getClass(), "minute", (byte) 44);
        setByteField(term260185, term260185.getClass(), "second", (byte) 59);
        setIntField(term260185, term260185.getClass(), "nano", 881407895);
        setField(term260180, term260180.getClass(), "time", term260185);
        setField(term260094, term260094.getClass(), "mdl_eqp_tm", term260180);
        setField(term260094, term260094.getClass(), "skn_eqp", term260190);
        setField(term260094, term260094.getClass(), "btn_se_eqp", term260192);
        setField(term260094, term260094.getClass(), "sld_se_eqp", term260194);
        setField(term260094, term260094.getClass(), "chn_sld_se_eqp", term260196);
        setField(term260094, term260094.getClass(), "sldr_tch_se_eqp", term260198);
        setField(term260094, term260094.getClass(), "vcld_pts", term260200);
        setField(term260094, term260094.getClass(), "passwd_stat", enum619);
        setField(term260094, term260094.getClass(), "cmd", "IDakEXhNfN");
        setField(term260094, term260094.getClass(), "req_id", "zuVCIcZmHu");
        setField(term260094, term260094.getClass(), "stat", "TOgWyfMILX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_plt_id", argTypes, term260094, args);
    }

};


