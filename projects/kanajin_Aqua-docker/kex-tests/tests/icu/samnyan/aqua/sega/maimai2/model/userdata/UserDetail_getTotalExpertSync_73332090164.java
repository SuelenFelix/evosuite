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

public class UserDetail_getTotalExpertSync_73332090164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231776;

    public UserDetail_getTotalExpertSync_73332090164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term231780 = new Long(7010148136855890340L);
        Integer term231843 = new Integer(-101515724);
        Integer term231845 = new Integer(987526407);
        ArrayList term231841 = new ArrayList();
        ((ArrayList) term231841).add(term231843);
        ((ArrayList) term231841).add(term231845);
        Integer term231851 = new Integer(-1370999464);
        Integer term231853 = new Integer(-409231949);
        ArrayList term231849 = new ArrayList();
        ((ArrayList) term231849).add(term231851);
        ((ArrayList) term231849).add(term231853);
        term231776 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term231778 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term231794 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231795 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231799 = newInstance(Class.forName("java.time.LocalTime"));
        Object term231804 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231805 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231809 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term231776, term231776.getClass(), "id", -2138139617859519044L);
        setLongField(term231778, term231778.getClass(), "id", -945634812351574587L);
        setField(term231778, term231778.getClass(), "extId", term231780);
        setField(term231778, term231778.getClass(), "luid", "VeVoOlkaSZ");
        setIntField(term231795, term231795.getClass(), "year", 2024);
        setShortField(term231795, term231795.getClass(), "month", (short) 5);
        setShortField(term231795, term231795.getClass(), "day", (short) 28);
        setField(term231794, term231794.getClass(), "date", term231795);
        setByteField(term231799, term231799.getClass(), "hour", (byte) 15);
        setByteField(term231799, term231799.getClass(), "minute", (byte) 17);
        setByteField(term231799, term231799.getClass(), "second", (byte) 52);
        setIntField(term231799, term231799.getClass(), "nano", 650019774);
        setField(term231794, term231794.getClass(), "time", term231799);
        setField(term231778, term231778.getClass(), "registerTime", term231794);
        setIntField(term231805, term231805.getClass(), "year", 2028);
        setShortField(term231805, term231805.getClass(), "month", (short) 12);
        setShortField(term231805, term231805.getClass(), "day", (short) 5);
        setField(term231804, term231804.getClass(), "date", term231805);
        setByteField(term231809, term231809.getClass(), "hour", (byte) 0);
        setByteField(term231809, term231809.getClass(), "minute", (byte) 31);
        setByteField(term231809, term231809.getClass(), "second", (byte) 47);
        setIntField(term231809, term231809.getClass(), "nano", 889672113);
        setField(term231804, term231804.getClass(), "time", term231809);
        setField(term231778, term231778.getClass(), "accessTime", term231804);
        setField(term231776, term231776.getClass(), "card", term231778);
        setField(term231776, term231776.getClass(), "userName", "wdxwtYvPiv");
        setIntField(term231776, term231776.getClass(), "isNetMember", -2034531066);
        setIntField(term231776, term231776.getClass(), "iconId", -198669254);
        setIntField(term231776, term231776.getClass(), "plateId", -1240490694);
        setIntField(term231776, term231776.getClass(), "titleId", 244720262);
        setIntField(term231776, term231776.getClass(), "partnerId", 370854194);
        setIntField(term231776, term231776.getClass(), "frameId", -17070269);
        setIntField(term231776, term231776.getClass(), "selectMapId", 1467833271);
        setIntField(term231776, term231776.getClass(), "totalAwake", 1376444883);
        setIntField(term231776, term231776.getClass(), "gradeRating", 48103208);
        setIntField(term231776, term231776.getClass(), "musicRating", -655467488);
        setIntField(term231776, term231776.getClass(), "playerRating", 283820186);
        setIntField(term231776, term231776.getClass(), "highestRating", 1640365049);
        setIntField(term231776, term231776.getClass(), "gradeRank", 1288816449);
        setIntField(term231776, term231776.getClass(), "classRank", 1261399430);
        setIntField(term231776, term231776.getClass(), "courseRank", 1575653315);
        setField(term231776, term231776.getClass(), "charaSlot", term231841);
        setField(term231776, term231776.getClass(), "charaLockSlot", term231849);
        setLongField(term231776, term231776.getClass(), "contentBit", 4804264407297537936L);
        setIntField(term231776, term231776.getClass(), "playCount", 2116845908);
        setField(term231776, term231776.getClass(), "eventWatchedDate", "xUmjORhtNm");
        setField(term231776, term231776.getClass(), "lastGameId", "aAllLDsbll");
        setField(term231776, term231776.getClass(), "lastRomVersion", "tATJNkymBw");
        setField(term231776, term231776.getClass(), "lastDataVersion", "bkSURJdLBL");
        setField(term231776, term231776.getClass(), "lastLoginDate", "aNcXIRUToO");
        setField(term231776, term231776.getClass(), "lastPlayDate", "nBABxWLGOf");
        setIntField(term231776, term231776.getClass(), "lastPlayCredit", 936161131);
        setIntField(term231776, term231776.getClass(), "lastPlayMode", -691701814);
        setIntField(term231776, term231776.getClass(), "lastPlaceId", 1510066525);
        setField(term231776, term231776.getClass(), "lastPlaceName", "jdlTBcTsNZ");
        setIntField(term231776, term231776.getClass(), "lastAllNetId", 1469611278);
        setIntField(term231776, term231776.getClass(), "lastRegionId", -1162670035);
        setField(term231776, term231776.getClass(), "lastRegionName", "fZOYubmjQr");
        setField(term231776, term231776.getClass(), "lastClientId", "NgDePNgOTA");
        setField(term231776, term231776.getClass(), "lastCountryCode", "vSBdHCYUVt");
        setIntField(term231776, term231776.getClass(), "lastSelectEMoney", -1451867244);
        setIntField(term231776, term231776.getClass(), "lastSelectTicket", 559904906);
        setIntField(term231776, term231776.getClass(), "lastSelectCourse", 393431288);
        setIntField(term231776, term231776.getClass(), "lastCountCourse", 644691432);
        setField(term231776, term231776.getClass(), "firstGameId", "THvGTpdqrf");
        setField(term231776, term231776.getClass(), "firstRomVersion", "ucbQApFAaL");
        setField(term231776, term231776.getClass(), "firstDataVersion", "ZxAIlRffKc");
        setField(term231776, term231776.getClass(), "firstPlayDate", "WazDBkwTAD");
        setField(term231776, term231776.getClass(), "compatibleCmVersion", "OMMiKBeIDF");
        setField(term231776, term231776.getClass(), "dailyBonusDate", "VVatnPtgTf");
        setField(term231776, term231776.getClass(), "dailyCourseBonusDate", "UQKKIKJhBm");
        setField(term231776, term231776.getClass(), "lastPairLoginDate", "fXkuwVyxxe");
        setField(term231776, term231776.getClass(), "lastTrialPlayDate", "xALGJngydr");
        setIntField(term231776, term231776.getClass(), "playVsCount", -531017774);
        setIntField(term231776, term231776.getClass(), "playSyncCount", 854607935);
        setIntField(term231776, term231776.getClass(), "winCount", -1266627939);
        setIntField(term231776, term231776.getClass(), "helpCount", 1228954206);
        setIntField(term231776, term231776.getClass(), "comboCount", 43427568);
        setLongField(term231776, term231776.getClass(), "totalDeluxscore", -3802999224635376611L);
        setLongField(term231776, term231776.getClass(), "totalBasicDeluxscore", -1638779219901812994L);
        setLongField(term231776, term231776.getClass(), "totalAdvancedDeluxscore", 2815686903333436830L);
        setLongField(term231776, term231776.getClass(), "totalExpertDeluxscore", -4726990010795804697L);
        setLongField(term231776, term231776.getClass(), "totalMasterDeluxscore", 18115689564627037L);
        setLongField(term231776, term231776.getClass(), "totalReMasterDeluxscore", -6649862739070461398L);
        setIntField(term231776, term231776.getClass(), "totalSync", -887356821);
        setIntField(term231776, term231776.getClass(), "totalBasicSync", 1123610004);
        setIntField(term231776, term231776.getClass(), "totalAdvancedSync", 184496760);
        setIntField(term231776, term231776.getClass(), "totalExpertSync", -903785659);
        setIntField(term231776, term231776.getClass(), "totalMasterSync", -759603874);
        setIntField(term231776, term231776.getClass(), "totalReMasterSync", -854724842);
        setLongField(term231776, term231776.getClass(), "totalAchievement", 5437696365924758973L);
        setLongField(term231776, term231776.getClass(), "totalBasicAchievement", 3839192148499886301L);
        setLongField(term231776, term231776.getClass(), "totalAdvancedAchievement", -7160579949074592420L);
        setLongField(term231776, term231776.getClass(), "totalExpertAchievement", -3750069780213532199L);
        setLongField(term231776, term231776.getClass(), "totalMasterAchievement", -8477618123087365585L);
        setLongField(term231776, term231776.getClass(), "totalReMasterAchievement", -1293962831337793157L);
        setLongField(term231776, term231776.getClass(), "playerOldRating", -8600281105080826389L);
        setLongField(term231776, term231776.getClass(), "playerNewRating", -5600163086356818263L);
        setIntField(term231776, term231776.getClass(), "banState", 1250890819);
        setLongField(term231776, term231776.getClass(), "dateTime", 7050041705355474598L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertSync", argTypes, term231776, args);
    }

};


