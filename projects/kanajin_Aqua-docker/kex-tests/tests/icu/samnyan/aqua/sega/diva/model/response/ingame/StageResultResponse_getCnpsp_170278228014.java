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
import java.lang.Object;

public class StageResultResponse_getCnpsp_170278228014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16470;

    public StageResultResponse_getCnpsp_170278228014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16470 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term16665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16670 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16470, term16470.getClass(), "chllng_kind", -310528004);
        setIntField(term16470, term16470.getClass(), "lv_num_old", -634976996);
        setIntField(term16470, term16470.getClass(), "lv_pnt_old", -1015274146);
        setIntField(term16470, term16470.getClass(), "lv_num", -49052672);
        setIntField(term16470, term16470.getClass(), "lv_pnt", 339372704);
        setField(term16470, term16470.getClass(), "lv_str", "dwlZSxlXOo");
        setIntField(term16470, term16470.getClass(), "lv_efct_id", -851097944);
        setIntField(term16470, term16470.getClass(), "lv_plt_id", 803925431);
        setIntField(term16470, term16470.getClass(), "vcld_pts", 76929641);
        setIntField(term16470, term16470.getClass(), "prsnt_vcld_pts", -2003192918);
        setIntField(term16470, term16470.getClass(), "cnp_cid", -1362856620);
        setIntField(term16470, term16470.getClass(), "cnp_val", -1835839814);
        setField(term16470, term16470.getClass(), "cnp_sp", "lKrEAkypza");
        setField(term16470, term16470.getClass(), "crwd_kind", "KtuuNAqGCQ");
        setField(term16470, term16470.getClass(), "crwd_value", "OGQsfjmReM");
        setField(term16470, term16470.getClass(), "crwd_str_0", "YsUtbngnRO");
        setField(term16470, term16470.getClass(), "crwd_str_1", "JisaWUxcNb");
        setIntField(term16470, term16470.getClass(), "cerwd_kind", -1404350380);
        setIntField(term16470, term16470.getClass(), "cerwd_value", -2013924238);
        setField(term16470, term16470.getClass(), "cerwd_str_0", "NxgmYPzWCI");
        setField(term16470, term16470.getClass(), "cerwd_str_1", "SqjyKmayBx");
        setField(term16470, term16470.getClass(), "ttl_str_ary", "XjDhvToxJy");
        setField(term16470, term16470.getClass(), "ttl_plt_id_ary", "nxSTJflLQy");
        setField(term16470, term16470.getClass(), "ttl_desc_ary", "FlHzxEfFzI");
        setField(term16470, term16470.getClass(), "skin_id_ary", "aSATgQUpoe");
        setField(term16470, term16470.getClass(), "skin_name_ary", "VkPSXewZfB");
        setField(term16470, term16470.getClass(), "skin_illust_ary", "ubodzJoMGW");
        setField(term16470, term16470.getClass(), "skin_desc_ary", "weddIktxOA");
        setIntField(term16470, term16470.getClass(), "pdddt_flg", 579006268);
        setIntField(term16666, term16666.getClass(), "year", 2021);
        setShortField(term16666, term16666.getClass(), "month", (short) 9);
        setShortField(term16666, term16666.getClass(), "day", (short) 7);
        setField(term16665, term16665.getClass(), "date", term16666);
        setByteField(term16670, term16670.getClass(), "hour", (byte) 5);
        setByteField(term16670, term16670.getClass(), "minute", (byte) 25);
        setByteField(term16670, term16670.getClass(), "second", (byte) 7);
        setIntField(term16670, term16670.getClass(), "nano", 755924076);
        setField(term16665, term16665.getClass(), "time", term16670);
        setField(term16470, term16470.getClass(), "pdddt_tm", term16665);
        setIntField(term16470, term16470.getClass(), "nblss_ltt_stts", -1694747156);
        setIntField(term16470, term16470.getClass(), "nblss_ltt_tckt", 1466373988);
        setIntField(term16470, term16470.getClass(), "nblss_ltt_is_opn", -358526505);
        setIntField(term16470, term16470.getClass(), "nblss_ltt_prz", 1843268026);
        setIntField(term16470, term16470.getClass(), "nblss_ltt_nxt_stts", 954660603);
        setIntField(term16470, term16470.getClass(), "nblss_ltt_nxt_tckt", -1351605385);
        setField(term16470, term16470.getClass(), "my_qst_id", "uSlMeISsDD");
        setField(term16470, term16470.getClass(), "my_qst_r_qid", "WdCiTDUKqn");
        setField(term16470, term16470.getClass(), "my_qst_r_knd", "PSizQDoxxe");
        setField(term16470, term16470.getClass(), "my_qst_r_vl", "mKaHyMybrK");
        setField(term16470, term16470.getClass(), "my_qst_r_nflg", "AyrEXuGrEj");
        setField(term16470, term16470.getClass(), "my_ccd_r_qid", "yevIIoVYHq");
        setField(term16470, term16470.getClass(), "my_ccd_r_hnd", "UuYWMTqWTV");
        setField(term16470, term16470.getClass(), "my_ccd_r_vp", "DSFGlcaXUb");
        setField(term16470, term16470.getClass(), "cmd", "sHMXNUzNeM");
        setField(term16470, term16470.getClass(), "req_id", "gPzGDOEPPw");
        setField(term16470, term16470.getClass(), "stat", "rwKoAngzCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCnp_sp", argTypes, term16470, args);
    }

};


