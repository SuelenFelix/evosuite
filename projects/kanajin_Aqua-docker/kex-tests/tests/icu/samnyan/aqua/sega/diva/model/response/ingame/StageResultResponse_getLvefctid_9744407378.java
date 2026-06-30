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

public class StageResultResponse_getLvefctid_9744407378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12852;

    public StageResultResponse_getLvefctid_9744407378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12852 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term13047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13052 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12852, term12852.getClass(), "chllng_kind", 1557431527);
        setIntField(term12852, term12852.getClass(), "lv_num_old", -1504890659);
        setIntField(term12852, term12852.getClass(), "lv_pnt_old", 1358829571);
        setIntField(term12852, term12852.getClass(), "lv_num", 991356662);
        setIntField(term12852, term12852.getClass(), "lv_pnt", -506958186);
        setField(term12852, term12852.getClass(), "lv_str", "zaloBqlrSo");
        setIntField(term12852, term12852.getClass(), "lv_efct_id", -507387516);
        setIntField(term12852, term12852.getClass(), "lv_plt_id", -1970452551);
        setIntField(term12852, term12852.getClass(), "vcld_pts", -1896376975);
        setIntField(term12852, term12852.getClass(), "prsnt_vcld_pts", 729658803);
        setIntField(term12852, term12852.getClass(), "cnp_cid", 114754804);
        setIntField(term12852, term12852.getClass(), "cnp_val", 1687361082);
        setField(term12852, term12852.getClass(), "cnp_sp", "vvoLrMGCoN");
        setField(term12852, term12852.getClass(), "crwd_kind", "pXdglvyrQe");
        setField(term12852, term12852.getClass(), "crwd_value", "OcfNzHYdki");
        setField(term12852, term12852.getClass(), "crwd_str_0", "uPuCVuZYOI");
        setField(term12852, term12852.getClass(), "crwd_str_1", "TweMFhxNdj");
        setIntField(term12852, term12852.getClass(), "cerwd_kind", 584893196);
        setIntField(term12852, term12852.getClass(), "cerwd_value", 497269071);
        setField(term12852, term12852.getClass(), "cerwd_str_0", "NBrvVzvQHe");
        setField(term12852, term12852.getClass(), "cerwd_str_1", "FjOiNAfBOc");
        setField(term12852, term12852.getClass(), "ttl_str_ary", "iCCsaLHohG");
        setField(term12852, term12852.getClass(), "ttl_plt_id_ary", "NJhGgctbdj");
        setField(term12852, term12852.getClass(), "ttl_desc_ary", "MYWYUeLGOp");
        setField(term12852, term12852.getClass(), "skin_id_ary", "tsTGdgQYUL");
        setField(term12852, term12852.getClass(), "skin_name_ary", "TtGbVmKcnX");
        setField(term12852, term12852.getClass(), "skin_illust_ary", "GJVkUrCVdD");
        setField(term12852, term12852.getClass(), "skin_desc_ary", "zNdorvdUgu");
        setIntField(term12852, term12852.getClass(), "pdddt_flg", -1899301124);
        setIntField(term13048, term13048.getClass(), "year", 2024);
        setShortField(term13048, term13048.getClass(), "month", (short) 1);
        setShortField(term13048, term13048.getClass(), "day", (short) 24);
        setField(term13047, term13047.getClass(), "date", term13048);
        setByteField(term13052, term13052.getClass(), "hour", (byte) 20);
        setByteField(term13052, term13052.getClass(), "minute", (byte) 28);
        setByteField(term13052, term13052.getClass(), "second", (byte) 39);
        setIntField(term13052, term13052.getClass(), "nano", 952728177);
        setField(term13047, term13047.getClass(), "time", term13052);
        setField(term12852, term12852.getClass(), "pdddt_tm", term13047);
        setIntField(term12852, term12852.getClass(), "nblss_ltt_stts", -1882480155);
        setIntField(term12852, term12852.getClass(), "nblss_ltt_tckt", -1410220680);
        setIntField(term12852, term12852.getClass(), "nblss_ltt_is_opn", 389427431);
        setIntField(term12852, term12852.getClass(), "nblss_ltt_prz", -1945706126);
        setIntField(term12852, term12852.getClass(), "nblss_ltt_nxt_stts", 1152356969);
        setIntField(term12852, term12852.getClass(), "nblss_ltt_nxt_tckt", -1667990367);
        setField(term12852, term12852.getClass(), "my_qst_id", "oPxuZbkYio");
        setField(term12852, term12852.getClass(), "my_qst_r_qid", "vKitydDVnM");
        setField(term12852, term12852.getClass(), "my_qst_r_knd", "urCiQnUFBM");
        setField(term12852, term12852.getClass(), "my_qst_r_vl", "EKjQdtKxAM");
        setField(term12852, term12852.getClass(), "my_qst_r_nflg", "TXZAIPQJHt");
        setField(term12852, term12852.getClass(), "my_ccd_r_qid", "DIbeDHICho");
        setField(term12852, term12852.getClass(), "my_ccd_r_hnd", "dJGPlmSRnz");
        setField(term12852, term12852.getClass(), "my_ccd_r_vp", "DPskuFUobI");
        setField(term12852, term12852.getClass(), "cmd", "wBGfLpNNiZ");
        setField(term12852, term12852.getClass(), "req_id", "yUGCjlqgJE");
        setField(term12852, term12852.getClass(), "stat", "PXdVZyoJyC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_efct_id", argTypes, term12852, args);
    }

};


