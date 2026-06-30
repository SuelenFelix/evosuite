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

public class StageResultResponse_getCerwdkind_204000656219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19485;

    public StageResultResponse_getCerwdkind_204000656219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19485 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term19680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19685 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19485, term19485.getClass(), "chllng_kind", -544382127);
        setIntField(term19485, term19485.getClass(), "lv_num_old", -1830198043);
        setIntField(term19485, term19485.getClass(), "lv_pnt_old", -439048495);
        setIntField(term19485, term19485.getClass(), "lv_num", -1849105286);
        setIntField(term19485, term19485.getClass(), "lv_pnt", 1334483645);
        setField(term19485, term19485.getClass(), "lv_str", "UiWhvbypdr");
        setIntField(term19485, term19485.getClass(), "lv_efct_id", 917513193);
        setIntField(term19485, term19485.getClass(), "lv_plt_id", 787278105);
        setIntField(term19485, term19485.getClass(), "vcld_pts", -2063843486);
        setIntField(term19485, term19485.getClass(), "prsnt_vcld_pts", 833762980);
        setIntField(term19485, term19485.getClass(), "cnp_cid", 320711637);
        setIntField(term19485, term19485.getClass(), "cnp_val", 1241164745);
        setField(term19485, term19485.getClass(), "cnp_sp", "CgleElJNje");
        setField(term19485, term19485.getClass(), "crwd_kind", "ZrchvNGMtd");
        setField(term19485, term19485.getClass(), "crwd_value", "WaEcyVlcIx");
        setField(term19485, term19485.getClass(), "crwd_str_0", "ONcbPCQnHd");
        setField(term19485, term19485.getClass(), "crwd_str_1", "AobDaplFLl");
        setIntField(term19485, term19485.getClass(), "cerwd_kind", 1723148410);
        setIntField(term19485, term19485.getClass(), "cerwd_value", -920797484);
        setField(term19485, term19485.getClass(), "cerwd_str_0", "pDkMNnAGgv");
        setField(term19485, term19485.getClass(), "cerwd_str_1", "PaCpFXGzdX");
        setField(term19485, term19485.getClass(), "ttl_str_ary", "FftYCNbnks");
        setField(term19485, term19485.getClass(), "ttl_plt_id_ary", "lJoltmsadS");
        setField(term19485, term19485.getClass(), "ttl_desc_ary", "mvfDtZNEHr");
        setField(term19485, term19485.getClass(), "skin_id_ary", "bvSgmFUDOU");
        setField(term19485, term19485.getClass(), "skin_name_ary", "XMHwbfiHRl");
        setField(term19485, term19485.getClass(), "skin_illust_ary", "bucTnYicnp");
        setField(term19485, term19485.getClass(), "skin_desc_ary", "EkgprvqZlM");
        setIntField(term19485, term19485.getClass(), "pdddt_flg", -1631697577);
        setIntField(term19681, term19681.getClass(), "year", 2017);
        setShortField(term19681, term19681.getClass(), "month", (short) 3);
        setShortField(term19681, term19681.getClass(), "day", (short) 5);
        setField(term19680, term19680.getClass(), "date", term19681);
        setByteField(term19685, term19685.getClass(), "hour", (byte) 20);
        setByteField(term19685, term19685.getClass(), "minute", (byte) 34);
        setByteField(term19685, term19685.getClass(), "second", (byte) 55);
        setIntField(term19685, term19685.getClass(), "nano", 78024496);
        setField(term19680, term19680.getClass(), "time", term19685);
        setField(term19485, term19485.getClass(), "pdddt_tm", term19680);
        setIntField(term19485, term19485.getClass(), "nblss_ltt_stts", 765731371);
        setIntField(term19485, term19485.getClass(), "nblss_ltt_tckt", -1703035419);
        setIntField(term19485, term19485.getClass(), "nblss_ltt_is_opn", 765766290);
        setIntField(term19485, term19485.getClass(), "nblss_ltt_prz", -1284825282);
        setIntField(term19485, term19485.getClass(), "nblss_ltt_nxt_stts", -1941343035);
        setIntField(term19485, term19485.getClass(), "nblss_ltt_nxt_tckt", 947897214);
        setField(term19485, term19485.getClass(), "my_qst_id", "fbnKvthhOz");
        setField(term19485, term19485.getClass(), "my_qst_r_qid", "PGfCDJTBek");
        setField(term19485, term19485.getClass(), "my_qst_r_knd", "ZwjARhAtHC");
        setField(term19485, term19485.getClass(), "my_qst_r_vl", "XXvscsYBWv");
        setField(term19485, term19485.getClass(), "my_qst_r_nflg", "uePedtiAfL");
        setField(term19485, term19485.getClass(), "my_ccd_r_qid", "AdSHvysxQB");
        setField(term19485, term19485.getClass(), "my_ccd_r_hnd", "jlraKkBWFA");
        setField(term19485, term19485.getClass(), "my_ccd_r_vp", "mRBtFTxVdE");
        setField(term19485, term19485.getClass(), "cmd", "IVacFDAZcj");
        setField(term19485, term19485.getClass(), "req_id", "EEYmuwyVDP");
        setField(term19485, term19485.getClass(), "stat", "EWFbEDAVrE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCerwd_kind", argTypes, term19485, args);
    }

};


