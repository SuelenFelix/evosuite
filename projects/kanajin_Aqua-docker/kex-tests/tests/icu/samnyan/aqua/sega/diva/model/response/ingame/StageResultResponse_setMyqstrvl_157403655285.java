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

public class StageResultResponse_setMyqstrvl_157403655285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59729;

    public StageResultResponse_setMyqstrvl_157403655285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59729 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term59924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59929 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term59729, term59729.getClass(), "chllng_kind", -919022885);
        setIntField(term59729, term59729.getClass(), "lv_num_old", -1836286878);
        setIntField(term59729, term59729.getClass(), "lv_pnt_old", 276336694);
        setIntField(term59729, term59729.getClass(), "lv_num", 1627938506);
        setIntField(term59729, term59729.getClass(), "lv_pnt", 386284750);
        setField(term59729, term59729.getClass(), "lv_str", "XiAUBffMZP");
        setIntField(term59729, term59729.getClass(), "lv_efct_id", 906856023);
        setIntField(term59729, term59729.getClass(), "lv_plt_id", 198857801);
        setIntField(term59729, term59729.getClass(), "vcld_pts", 1342884142);
        setIntField(term59729, term59729.getClass(), "prsnt_vcld_pts", -1454325068);
        setIntField(term59729, term59729.getClass(), "cnp_cid", 346714653);
        setIntField(term59729, term59729.getClass(), "cnp_val", 2121928697);
        setField(term59729, term59729.getClass(), "cnp_sp", "pkfsHvqODq");
        setField(term59729, term59729.getClass(), "crwd_kind", "OoRBUdwown");
        setField(term59729, term59729.getClass(), "crwd_value", "lSidZunNtu");
        setField(term59729, term59729.getClass(), "crwd_str_0", "TLUhUnoanK");
        setField(term59729, term59729.getClass(), "crwd_str_1", "JXyQTIyIrU");
        setIntField(term59729, term59729.getClass(), "cerwd_kind", -1741056571);
        setIntField(term59729, term59729.getClass(), "cerwd_value", 522501050);
        setField(term59729, term59729.getClass(), "cerwd_str_0", "uplmRQRGWr");
        setField(term59729, term59729.getClass(), "cerwd_str_1", "ZEmNnaQFYB");
        setField(term59729, term59729.getClass(), "ttl_str_ary", "FNxFpCZxLW");
        setField(term59729, term59729.getClass(), "ttl_plt_id_ary", "sXMXSCUbRu");
        setField(term59729, term59729.getClass(), "ttl_desc_ary", "iualVLfDmL");
        setField(term59729, term59729.getClass(), "skin_id_ary", "bhEFtkUvDw");
        setField(term59729, term59729.getClass(), "skin_name_ary", "ZmbknwMIBa");
        setField(term59729, term59729.getClass(), "skin_illust_ary", "UiRmBTpDTp");
        setField(term59729, term59729.getClass(), "skin_desc_ary", "zQtuUgUIjK");
        setIntField(term59729, term59729.getClass(), "pdddt_flg", 125432890);
        setIntField(term59925, term59925.getClass(), "year", 2013);
        setShortField(term59925, term59925.getClass(), "month", (short) 9);
        setShortField(term59925, term59925.getClass(), "day", (short) 19);
        setField(term59924, term59924.getClass(), "date", term59925);
        setByteField(term59929, term59929.getClass(), "hour", (byte) 12);
        setByteField(term59929, term59929.getClass(), "minute", (byte) 29);
        setByteField(term59929, term59929.getClass(), "second", (byte) 28);
        setIntField(term59929, term59929.getClass(), "nano", 244069764);
        setField(term59924, term59924.getClass(), "time", term59929);
        setField(term59729, term59729.getClass(), "pdddt_tm", term59924);
        setIntField(term59729, term59729.getClass(), "nblss_ltt_stts", -197740561);
        setIntField(term59729, term59729.getClass(), "nblss_ltt_tckt", -1811706962);
        setIntField(term59729, term59729.getClass(), "nblss_ltt_is_opn", -1242133071);
        setIntField(term59729, term59729.getClass(), "nblss_ltt_prz", -455052015);
        setIntField(term59729, term59729.getClass(), "nblss_ltt_nxt_stts", -1322797287);
        setIntField(term59729, term59729.getClass(), "nblss_ltt_nxt_tckt", -615198242);
        setField(term59729, term59729.getClass(), "my_qst_id", "VBeGRjPsPN");
        setField(term59729, term59729.getClass(), "my_qst_r_qid", "pZrAdSHQIs");
        setField(term59729, term59729.getClass(), "my_qst_r_knd", "XTOiucaEva");
        setField(term59729, term59729.getClass(), "my_qst_r_vl", "JMekRNxFMU");
        setField(term59729, term59729.getClass(), "my_qst_r_nflg", "LBNEEquiet");
        setField(term59729, term59729.getClass(), "my_ccd_r_qid", "cBMdxJirJj");
        setField(term59729, term59729.getClass(), "my_ccd_r_hnd", "kVnxgkemHF");
        setField(term59729, term59729.getClass(), "my_ccd_r_vp", "JUQnEoujef");
        setField(term59729, term59729.getClass(), "cmd", "riXARUiigm");
        setField(term59729, term59729.getClass(), "req_id", "RbXhBDZbRT");
        setField(term59729, term59729.getClass(), "stat", "QDaTqkWnGj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vNObzQvzxo";
        callMethod(klass, "setMy_qst_r_vl", argTypes, term59729, args);
    }

};


