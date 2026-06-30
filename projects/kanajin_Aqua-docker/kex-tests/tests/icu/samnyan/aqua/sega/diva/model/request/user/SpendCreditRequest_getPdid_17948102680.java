package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpendCreditRequest_getPdid_17948102680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SpendCreditRequest_getPdid_17948102680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term3 = (int[]) newIntArray(5);
        int[] term9 = (int[]) newIntArray(4);
        int[] term15 = (int[]) newIntArray(3);
        int[] term19 = (int[]) newIntArray(4);
        Object term108 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term129 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term146 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term147 = (long[]) newLongArray(1);
        Object[] term149 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term150 = (long[]) newLongArray(39);
        Object[] term190 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term191 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term192 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term193 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term1, term1.getClass(), "pd_id", 568599855);
        setIntElement(term3, 0, 1162663216);
        setIntElement(term3, 1, 1484323161);
        setIntElement(term3, 2, 391863371);
        setIntElement(term3, 3, -1922583790);
        setIntElement(term3, 4, -616727354);
        setField(term1, term1.getClass(), "my_qst_id", term3);
        setIntElement(term9, 0, -1955890973);
        setIntElement(term9, 1, -2038273078);
        setIntElement(term9, 2, 1227103734);
        setIntElement(term9, 3, -1339778481);
        setField(term1, term1.getClass(), "my_qst_sts", term9);
        setIntField(term1, term1.getClass(), "crdt_typ", 1725571209);
        setIntElement(term15, 0, -522618178);
        setIntElement(term15, 1, 1134449235);
        setIntElement(term15, 2, -883034806);
        setField(term1, term1.getClass(), "cmpgn_id", term15);
        setIntElement(term19, 0, 1585847225);
        setIntElement(term19, 1, 597278769);
        setIntElement(term19, 2, -1685132342);
        setIntElement(term19, 3, -1456670397);
        setField(term1, term1.getClass(), "cmpgn_pb", term19);
        setField(term1, term1.getClass(), "cmd", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "req_id", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "game_id", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "r_ver", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "kc_serial", "jJCZpVmanW");
        setField(term1, term1.getClass(), "b_serial", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "place_id", "SzjVpOQTyS");
        setIntField(term110, term110.getClass(), "year", 2012);
        setShortField(term110, term110.getClass(), "month", (short) 8);
        setShortField(term110, term110.getClass(), "day", (short) 25);
        setField(term109, term109.getClass(), "date", term110);
        setByteField(term114, term114.getClass(), "hour", (byte) 5);
        setByteField(term114, term114.getClass(), "minute", (byte) 20);
        setByteField(term114, term114.getClass(), "second", (byte) 50);
        setIntField(term114, term114.getClass(), "nano", 345595912);
        setField(term109, term109.getClass(), "time", term114);
        setField(term108, term108.getClass(), "dateTime", term109);
        setIntField(term119, term119.getClass(), "totalSeconds", -10800);
        setField(term119, term119.getClass(), "id", "-03:00");
        setField(term108, term108.getClass(), "offset", term119);
        setField(term129, term129.getClass(), "id", "America/Recife");
        setLongElement(term147, 0, -1767217224L);
        setField(term146, term146.getClass(), "standardTransitions", term147);
        setElement(term149, 1, term119);
        setField(term146, term146.getClass(), "standardOffsets", term149);
        setLongElement(term150, 0, -1767217224L);
        setLongElement(term150, 1, -1206957600L);
        setLongElement(term150, 2, -1191362400L);
        setLongElement(term150, 3, -1175374800L);
        setLongElement(term150, 4, -1159826400L);
        setLongElement(term150, 5, -633819600L);
        setLongElement(term150, 6, -622069200L);
        setLongElement(term150, 7, -602283600L);
        setLongElement(term150, 8, -591832800L);
        setLongElement(term150, 9, -570747600L);
        setLongElement(term150, 10, -560210400L);
        setLongElement(term150, 11, -539125200L);
        setLongElement(term150, 12, -531352800L);
        setLongElement(term150, 13, -191365200L);
        setLongElement(term150, 14, -184197600L);
        setLongElement(term150, 15, -155163600L);
        setLongElement(term150, 16, -150069600L);
        setLongElement(term150, 17, -128898000L);
        setLongElement(term150, 18, -121125600L);
        setLongElement(term150, 19, -99954000L);
        setLongElement(term150, 20, -89589600L);
        setLongElement(term150, 21, -68418000L);
        setLongElement(term150, 22, -57967200L);
        setLongElement(term150, 23, 499748400L);
        setLongElement(term150, 24, 511236000L);
        setLongElement(term150, 25, 530593200L);
        setLongElement(term150, 26, 540266400L);
        setLongElement(term150, 27, 562129200L);
        setLongElement(term150, 28, 571197600L);
        setLongElement(term150, 29, 592974000L);
        setLongElement(term150, 30, 602042400L);
        setLongElement(term150, 31, 624423600L);
        setLongElement(term150, 32, 634701600L);
        setLongElement(term150, 33, 938919600L);
        setLongElement(term150, 34, 951616800L);
        setLongElement(term150, 35, 970974000L);
        setLongElement(term150, 36, 971575200L);
        setLongElement(term150, 37, 1003028400L);
        setLongElement(term150, 38, 1013911200L);
        setField(term146, term146.getClass(), "savingsInstantTransitions", term150);
        setField(term146, term146.getClass(), "savingsLocalTransitions", term190);
        setElement(term191, 1, term119);
        setElement(term191, 3, term119);
        setElement(term191, 5, term119);
        setElement(term191, 7, term119);
        setElement(term191, 9, term119);
        setElement(term191, 11, term119);
        setElement(term191, 13, term119);
        setElement(term191, 15, term119);
        setElement(term191, 17, term119);
        setElement(term191, 19, term119);
        setElement(term191, 21, term119);
        setElement(term191, 23, term119);
        setElement(term191, 25, term119);
        setElement(term191, 27, term119);
        setElement(term191, 29, term119);
        setElement(term191, 31, term119);
        setElement(term191, 33, term119);
        setElement(term191, 35, term119);
        setElement(term191, 37, term119);
        setElement(term191, 39, term119);
        setField(term146, term146.getClass(), "wallOffsets", term191);
        setField(term146, term146.getClass(), "lastRules", term192);
        setField(term193, term193.getClass(), "table", null);
        setField(term193, term193.getClass(), "nextTable", null);
        setLongField(term193, term193.getClass(), "baseCount", 0L);
        setIntField(term193, term193.getClass(), "sizeCtl", 0);
        setIntField(term193, term193.getClass(), "transferIndex", 0);
        setIntField(term193, term193.getClass(), "cellsBusy", 0);
        setField(term193, term193.getClass(), "counterCells", null);
        setField(term193, term193.getClass(), "keySet", null);
        setField(term193, term193.getClass(), "values", null);
        setField(term193, term193.getClass(), "entrySet", null);
        setField(term193, term193.getClass(), "keySet", null);
        setField(term193, term193.getClass(), "values", null);
        setField(term146, term146.getClass(), "lastRulesCache", term193);
        setField(term129, term129.getClass(), "rules", term146);
        setField(term108, term108.getClass(), "zone", term129);
        setField(term1, term1.getClass(), "time_stamp", term108);
        setField(term1, term1.getClass(), "start_up_mode", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "cmm_dly_mod", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "cmm_dly_sec", "RMFIsYGgne");
        setField(term1, term1.getClass(), "cmm_err_mod", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "country_code", "uuaPigETmJ");
        setField(term1, term1.getClass(), "region_code", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term1, args);
    }

};


