package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserCharge_setPurchaseDate_30983676111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127688;

    public UserCharge_setPurchaseDate_30983676111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term127694 = new Long(3381333711768010594L);
        Integer term127757 = new Integer(312605349);
        Integer term127759 = new Integer(-402072606);
        Integer term127761 = new Integer(-477355193);
        Integer term127763 = new Integer(168425089);
        Integer term127765 = new Integer(-571931590);
        Integer term127767 = new Integer(37757400);
        ArrayList term127755 = new ArrayList();
        ((ArrayList) term127755).add(term127757);
        ((ArrayList) term127755).add(term127759);
        ((ArrayList) term127755).add(term127761);
        ((ArrayList) term127755).add(term127763);
        ((ArrayList) term127755).add(term127765);
        ((ArrayList) term127755).add(term127767);
        Integer term127773 = new Integer(-1632221612);
        Integer term127775 = new Integer(1545314376);
        Integer term127777 = new Integer(437959151);
        ArrayList term127771 = new ArrayList();
        ((ArrayList) term127771).add(term127773);
        ((ArrayList) term127771).add(term127775);
        ((ArrayList) term127771).add(term127777);
        term127688 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term127690 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term127692 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term127708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127713 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127723 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term127688, term127688.getClass(), "id", -984845489769970339L);
        setLongField(term127690, term127690.getClass(), "id", 1509515931025726141L);
        setLongField(term127692, term127692.getClass(), "id", 5177705694707399783L);
        setField(term127692, term127692.getClass(), "extId", term127694);
        setField(term127692, term127692.getClass(), "luid", "JCeHaSFOWK");
        setIntField(term127709, term127709.getClass(), "year", 2017);
        setShortField(term127709, term127709.getClass(), "month", (short) 11);
        setShortField(term127709, term127709.getClass(), "day", (short) 17);
        setField(term127708, term127708.getClass(), "date", term127709);
        setByteField(term127713, term127713.getClass(), "hour", (byte) 8);
        setByteField(term127713, term127713.getClass(), "minute", (byte) 54);
        setByteField(term127713, term127713.getClass(), "second", (byte) 50);
        setIntField(term127713, term127713.getClass(), "nano", 819857135);
        setField(term127708, term127708.getClass(), "time", term127713);
        setField(term127692, term127692.getClass(), "registerTime", term127708);
        setIntField(term127719, term127719.getClass(), "year", 2020);
        setShortField(term127719, term127719.getClass(), "month", (short) 2);
        setShortField(term127719, term127719.getClass(), "day", (short) 27);
        setField(term127718, term127718.getClass(), "date", term127719);
        setByteField(term127723, term127723.getClass(), "hour", (byte) 21);
        setByteField(term127723, term127723.getClass(), "minute", (byte) 35);
        setByteField(term127723, term127723.getClass(), "second", (byte) 42);
        setIntField(term127723, term127723.getClass(), "nano", 887239335);
        setField(term127718, term127718.getClass(), "time", term127723);
        setField(term127692, term127692.getClass(), "accessTime", term127718);
        setField(term127690, term127690.getClass(), "card", term127692);
        setField(term127690, term127690.getClass(), "userName", "PNtiQWTZzA");
        setIntField(term127690, term127690.getClass(), "isNetMember", -1670070098);
        setIntField(term127690, term127690.getClass(), "iconId", 467509047);
        setIntField(term127690, term127690.getClass(), "plateId", -904447748);
        setIntField(term127690, term127690.getClass(), "titleId", 854911566);
        setIntField(term127690, term127690.getClass(), "partnerId", -1420033797);
        setIntField(term127690, term127690.getClass(), "frameId", 747673390);
        setIntField(term127690, term127690.getClass(), "selectMapId", 705588535);
        setIntField(term127690, term127690.getClass(), "totalAwake", -2070496137);
        setIntField(term127690, term127690.getClass(), "gradeRating", -716175280);
        setIntField(term127690, term127690.getClass(), "musicRating", 1978574372);
        setIntField(term127690, term127690.getClass(), "playerRating", 267968248);
        setIntField(term127690, term127690.getClass(), "highestRating", 994276530);
        setIntField(term127690, term127690.getClass(), "gradeRank", 1628085673);
        setIntField(term127690, term127690.getClass(), "classRank", -2024076633);
        setIntField(term127690, term127690.getClass(), "courseRank", -1871930908);
        setField(term127690, term127690.getClass(), "charaSlot", term127755);
        setField(term127690, term127690.getClass(), "charaLockSlot", term127771);
        setLongField(term127690, term127690.getClass(), "contentBit", -6461397685703694449L);
        setIntField(term127690, term127690.getClass(), "playCount", 1529921600);
        setField(term127690, term127690.getClass(), "eventWatchedDate", "raishRurKx");
        setField(term127690, term127690.getClass(), "lastGameId", "PpeSAmBPlT");
        setField(term127690, term127690.getClass(), "lastRomVersion", "XmRRZpyFKp");
        setField(term127690, term127690.getClass(), "lastDataVersion", "QXOnXJGHZk");
        setField(term127690, term127690.getClass(), "lastLoginDate", "tckSURIPmO");
        setField(term127690, term127690.getClass(), "lastPlayDate", "GZSnqwBCPQ");
        setIntField(term127690, term127690.getClass(), "lastPlayCredit", 1411675971);
        setIntField(term127690, term127690.getClass(), "lastPlayMode", 1224330822);
        setIntField(term127690, term127690.getClass(), "lastPlaceId", 991967399);
        setField(term127690, term127690.getClass(), "lastPlaceName", "zxdSWLKWYw");
        setIntField(term127690, term127690.getClass(), "lastAllNetId", -653419421);
        setIntField(term127690, term127690.getClass(), "lastRegionId", -364951490);
        setField(term127690, term127690.getClass(), "lastRegionName", "VurQtsudbR");
        setField(term127690, term127690.getClass(), "lastClientId", "KdIGyBXZVB");
        setField(term127690, term127690.getClass(), "lastCountryCode", "eKvGCdbyoP");
        setIntField(term127690, term127690.getClass(), "lastSelectEMoney", 1275653221);
        setIntField(term127690, term127690.getClass(), "lastSelectTicket", 221439292);
        setIntField(term127690, term127690.getClass(), "lastSelectCourse", -1449686187);
        setIntField(term127690, term127690.getClass(), "lastCountCourse", -1374649219);
        setField(term127690, term127690.getClass(), "firstGameId", "MgMUmPLywB");
        setField(term127690, term127690.getClass(), "firstRomVersion", "pNJhowQpXJ");
        setField(term127690, term127690.getClass(), "firstDataVersion", "gyfupqhzxo");
        setField(term127690, term127690.getClass(), "firstPlayDate", "WUwUHGneAq");
        setField(term127690, term127690.getClass(), "compatibleCmVersion", "zlVKedpZvy");
        setField(term127690, term127690.getClass(), "dailyBonusDate", "PEUAKKJLwI");
        setField(term127690, term127690.getClass(), "dailyCourseBonusDate", "cYvFrvYBOd");
        setField(term127690, term127690.getClass(), "lastPairLoginDate", "WfCGsRvHTg");
        setField(term127690, term127690.getClass(), "lastTrialPlayDate", "jsThoorJsk");
        setIntField(term127690, term127690.getClass(), "playVsCount", 1856279121);
        setIntField(term127690, term127690.getClass(), "playSyncCount", -407004822);
        setIntField(term127690, term127690.getClass(), "winCount", -1357273988);
        setIntField(term127690, term127690.getClass(), "helpCount", -923140400);
        setIntField(term127690, term127690.getClass(), "comboCount", -553202541);
        setLongField(term127690, term127690.getClass(), "totalDeluxscore", -1352759923751287487L);
        setLongField(term127690, term127690.getClass(), "totalBasicDeluxscore", 776959709485350743L);
        setLongField(term127690, term127690.getClass(), "totalAdvancedDeluxscore", -2636982387234489767L);
        setLongField(term127690, term127690.getClass(), "totalExpertDeluxscore", -8815984245590591067L);
        setLongField(term127690, term127690.getClass(), "totalMasterDeluxscore", -1003686044277246587L);
        setLongField(term127690, term127690.getClass(), "totalReMasterDeluxscore", -8776098518047697120L);
        setIntField(term127690, term127690.getClass(), "totalSync", -921082991);
        setIntField(term127690, term127690.getClass(), "totalBasicSync", -1697647652);
        setIntField(term127690, term127690.getClass(), "totalAdvancedSync", -653540011);
        setIntField(term127690, term127690.getClass(), "totalExpertSync", -897305207);
        setIntField(term127690, term127690.getClass(), "totalMasterSync", -1682000986);
        setIntField(term127690, term127690.getClass(), "totalReMasterSync", 417127629);
        setLongField(term127690, term127690.getClass(), "totalAchievement", 8404934947021386860L);
        setLongField(term127690, term127690.getClass(), "totalBasicAchievement", 6719075499684927110L);
        setLongField(term127690, term127690.getClass(), "totalAdvancedAchievement", 5483860233667206947L);
        setLongField(term127690, term127690.getClass(), "totalExpertAchievement", 3676789390529205745L);
        setLongField(term127690, term127690.getClass(), "totalMasterAchievement", -8742664229808515814L);
        setLongField(term127690, term127690.getClass(), "totalReMasterAchievement", 4520972160981828699L);
        setLongField(term127690, term127690.getClass(), "playerOldRating", -1397583526788570055L);
        setLongField(term127690, term127690.getClass(), "playerNewRating", -8878130853856860317L);
        setIntField(term127690, term127690.getClass(), "banState", 891084826);
        setLongField(term127690, term127690.getClass(), "dateTime", -6748373037285093819L);
        setField(term127688, term127688.getClass(), "user", term127690);
        setIntField(term127688, term127688.getClass(), "chargeId", -1903396559);
        setIntField(term127688, term127688.getClass(), "stock", -379718533);
        setField(term127688, term127688.getClass(), "purchaseDate", "DiLoLWWibV");
        setField(term127688, term127688.getClass(), "validDate", "jLARiCBiTZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qgloCkfuKr";
        callMethod(klass, "setPurchaseDate", argTypes, term127688, args);
    }

};


