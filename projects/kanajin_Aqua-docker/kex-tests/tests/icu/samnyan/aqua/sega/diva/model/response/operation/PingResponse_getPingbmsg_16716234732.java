package icu.samnyan.aqua.sega.diva.model.response.operation;

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
import static icu.samnyan.aqua.sega.diva.model.response.operation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PingResponse_getPingbmsg_16716234732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177;

    public PingResponse_getPingbmsg_16716234732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term491 = new Integer(568599855);
        Integer term493 = new Integer(1162663216);
        Integer term495 = new Integer(1484323161);
        term177 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term177, term177.getClass(), "ping_b_msg", "hRNSzYYIrc");
        setField(term177, term177.getClass(), "ping_m_msg", "RMFIsYGgne");
        setField(term177, term177.getClass(), "atnd_lut", "NRdvgJlhkX");
        setField(term177, term177.getClass(), "fi_lut", "uuaPigETmJ");
        setField(term177, term177.getClass(), "ci_lut", "MxlszYVzRf");
        setField(term177, term177.getClass(), "qi_lut", "LQFpaHEwXR");
        setField(term177, term177.getClass(), "pvl_lut", "oVcInYnLWB");
        setField(term177, term177.getClass(), "pdcl_lut", "aJlieCFVtF");
        setField(term177, term177.getClass(), "pnml_lut", "ZiaGIbnzTs");
        setField(term177, term177.getClass(), "cinml_lut", "tbcdzjIfER");
        setField(term177, term177.getClass(), "rwl_lut", "HyxfbSQYBe");
        setField(term177, term177.getClass(), "bdlol_lut", "pCTimMblYc");
        setField(term177, term177.getClass(), "shp_ctlg_lut", "hNxWaHcfhY");
        setField(term177, term177.getClass(), "cstmz_itm_ctlg_lut", "RkybSrpybU");
        setField(term177, term177.getClass(), "ngwl_lut", "xOEqzGAmDU");
        setField(term177, term177.getClass(), "rnk_nv_lut", "eZFUvlxvGV");
        setField(term177, term177.getClass(), "rnk_ps_lut", "BYqFIqCKAV");
        setField(term177, term177.getClass(), "bi_lut", "vrQLuWIDJX");
        setField(term177, term177.getClass(), "cpi_lut", "flxyYxBRtu");
        setField(term177, term177.getClass(), "p_std_hc_lut", "OclPbYPkcH");
        setField(term177, term177.getClass(), "p_std_i_n_lut", "IoAlmYsBwc");
        setField(term177, term177.getClass(), "req_inv_cmd_num", "TEParAifyi");
        setField(term177, term177.getClass(), "req_inv_cmd_prm1", "OWDIEULEFu");
        setField(term177, term177.getClass(), "req_inv_cmd_prm2", "dWRymuLBtr");
        setField(term177, term177.getClass(), "req_inv_cmd_prm3", "AijpHYOFuy");
        setField(term177, term177.getClass(), "req_inv_cmd_prm4", "SbAoxhfrkn");
        setBooleanField(term177, term177.getClass(), "pow_save_flg", false);
        setField(term177, term177.getClass(), "nblss_dnt_p", term491);
        setField(term177, term177.getClass(), "nblss_ltt_rl_vp", term493);
        setField(term177, term177.getClass(), "nblss_ex_ltt_flg", term495);
        setField(term177, term177.getClass(), "nblss_dnt_st_tm", "kuTXqwMtDB");
        setField(term177, term177.getClass(), "nblss_dnt_ed_tm", "Ghbwtircqb");
        setField(term177, term177.getClass(), "nblss_ltt_st_tm", "xrwlQZdwCp");
        setField(term177, term177.getClass(), "nblss_ltt_ed_tm", "IDCWpPLRkE");
        setField(term177, term177.getClass(), "cmd", "nyiiPDVjAc");
        setField(term177, term177.getClass(), "req_id", "aKnKipADSo");
        setField(term177, term177.getClass(), "stat", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPing_b_msg", argTypes, term177, args);
    }

};


