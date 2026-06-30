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

public class UserDetail_getPlayerOldRating_139643630973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4270907;

    public UserDetail_getPlayerOldRating_139643630973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4270911 = new Long(-7820629957062019016L);
        ArrayList term4270972 = new ArrayList();
        Integer term4270978 = new Integer(-37175334);
        Integer term4270980 = new Integer(657697442);
        Integer term4270982 = new Integer(1692013158);
        Integer term4270984 = new Integer(1102246253);
        Integer term4270986 = new Integer(-551112117);
        Integer term4270988 = new Integer(-1391764319);
        Integer term4270990 = new Integer(-37130270);
        ArrayList term4270976 = new ArrayList();
        ((ArrayList) term4270976).add(term4270978);
        ((ArrayList) term4270976).add(term4270980);
        ((ArrayList) term4270976).add(term4270982);
        ((ArrayList) term4270976).add(term4270984);
        ((ArrayList) term4270976).add(term4270986);
        ((ArrayList) term4270976).add(term4270988);
        ((ArrayList) term4270976).add(term4270990);
        term4270907 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4270909 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4270925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4270926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4270930 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4270935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4270936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4270940 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4270907, term4270907.getClass(), "id", 9105316383022662063L);
        setLongField(term4270909, term4270909.getClass(), "id", -4497097358444938424L);
        setField(term4270909, term4270909.getClass(), "extId", term4270911);
        setField(term4270909, term4270909.getClass(), "luid", "coiTvElwgc");
        setIntField(term4270926, term4270926.getClass(), "year", 2020);
        setShortField(term4270926, term4270926.getClass(), "month", (short) 6);
        setShortField(term4270926, term4270926.getClass(), "day", (short) 26);
        setField(term4270925, term4270925.getClass(), "date", term4270926);
        setByteField(term4270930, term4270930.getClass(), "hour", (byte) 13);
        setByteField(term4270930, term4270930.getClass(), "minute", (byte) 28);
        setByteField(term4270930, term4270930.getClass(), "second", (byte) 24);
        setIntField(term4270930, term4270930.getClass(), "nano", 729317283);
        setField(term4270925, term4270925.getClass(), "time", term4270930);
        setField(term4270909, term4270909.getClass(), "registerTime", term4270925);
        setIntField(term4270936, term4270936.getClass(), "year", 2017);
        setShortField(term4270936, term4270936.getClass(), "month", (short) 10);
        setShortField(term4270936, term4270936.getClass(), "day", (short) 4);
        setField(term4270935, term4270935.getClass(), "date", term4270936);
        setByteField(term4270940, term4270940.getClass(), "hour", (byte) 8);
        setByteField(term4270940, term4270940.getClass(), "minute", (byte) 0);
        setByteField(term4270940, term4270940.getClass(), "second", (byte) 25);
        setIntField(term4270940, term4270940.getClass(), "nano", 387631088);
        setField(term4270935, term4270935.getClass(), "time", term4270940);
        setField(term4270909, term4270909.getClass(), "accessTime", term4270935);
        setField(term4270907, term4270907.getClass(), "card", term4270909);
        setField(term4270907, term4270907.getClass(), "userName", "lMoozmqdJO");
        setIntField(term4270907, term4270907.getClass(), "isNetMember", 1166820976);
        setIntField(term4270907, term4270907.getClass(), "iconId", -809637079);
        setIntField(term4270907, term4270907.getClass(), "plateId", -749843978);
        setIntField(term4270907, term4270907.getClass(), "titleId", -630961076);
        setIntField(term4270907, term4270907.getClass(), "partnerId", 1893890639);
        setIntField(term4270907, term4270907.getClass(), "frameId", 1567214989);
        setIntField(term4270907, term4270907.getClass(), "selectMapId", -1435559808);
        setIntField(term4270907, term4270907.getClass(), "totalAwake", -2140708120);
        setIntField(term4270907, term4270907.getClass(), "gradeRating", -1983466734);
        setIntField(term4270907, term4270907.getClass(), "musicRating", -1504255502);
        setIntField(term4270907, term4270907.getClass(), "playerRating", -1578219032);
        setIntField(term4270907, term4270907.getClass(), "highestRating", 856171716);
        setIntField(term4270907, term4270907.getClass(), "gradeRank", 89415251);
        setIntField(term4270907, term4270907.getClass(), "classRank", -530214685);
        setIntField(term4270907, term4270907.getClass(), "courseRank", -491566554);
        setField(term4270907, term4270907.getClass(), "charaSlot", term4270972);
        setField(term4270907, term4270907.getClass(), "charaLockSlot", term4270976);
        setLongField(term4270907, term4270907.getClass(), "contentBit", -3449712574403673500L);
        setIntField(term4270907, term4270907.getClass(), "playCount", -1156556481);
        setField(term4270907, term4270907.getClass(), "eventWatchedDate", "NxXUUrsZat");
        setField(term4270907, term4270907.getClass(), "lastGameId", "BDnYuROuSi");
        setField(term4270907, term4270907.getClass(), "lastRomVersion", "XoCNMOxyxn");
        setField(term4270907, term4270907.getClass(), "lastDataVersion", "PgmBQPDqdw");
        setField(term4270907, term4270907.getClass(), "lastLoginDate", "PiuxUJOfyZ");
        setField(term4270907, term4270907.getClass(), "lastPlayDate", "gIahXVfaOI");
        setIntField(term4270907, term4270907.getClass(), "lastPlayCredit", 1423567330);
        setIntField(term4270907, term4270907.getClass(), "lastPlayMode", -1884828982);
        setIntField(term4270907, term4270907.getClass(), "lastPlaceId", 1527437611);
        setField(term4270907, term4270907.getClass(), "lastPlaceName", "abLfzoNdUH");
        setIntField(term4270907, term4270907.getClass(), "lastAllNetId", -2080291535);
        setIntField(term4270907, term4270907.getClass(), "lastRegionId", -55245280);
        setField(term4270907, term4270907.getClass(), "lastRegionName", "filWAHdhKI");
        setField(term4270907, term4270907.getClass(), "lastClientId", "ExhmaQtZlX");
        setField(term4270907, term4270907.getClass(), "lastCountryCode", "anHxXAktCk");
        setIntField(term4270907, term4270907.getClass(), "lastSelectEMoney", 590396855);
        setIntField(term4270907, term4270907.getClass(), "lastSelectTicket", -1458206888);
        setIntField(term4270907, term4270907.getClass(), "lastSelectCourse", 64938063);
        setIntField(term4270907, term4270907.getClass(), "lastCountCourse", 1207974284);
        setField(term4270907, term4270907.getClass(), "firstGameId", "fDpLnqDnkO");
        setField(term4270907, term4270907.getClass(), "firstRomVersion", "hRMVXsijbi");
        setField(term4270907, term4270907.getClass(), "firstDataVersion", "JmpyulCtYh");
        setField(term4270907, term4270907.getClass(), "firstPlayDate", "XpAnsJmpnC");
        setField(term4270907, term4270907.getClass(), "compatibleCmVersion", "TrfhiSXZRz");
        setField(term4270907, term4270907.getClass(), "dailyBonusDate", "BAwDXuOHBg");
        setField(term4270907, term4270907.getClass(), "dailyCourseBonusDate", "QIzwURGSik");
        setField(term4270907, term4270907.getClass(), "lastPairLoginDate", "cYFchcBXey");
        setField(term4270907, term4270907.getClass(), "lastTrialPlayDate", "BhINiJMXTw");
        setIntField(term4270907, term4270907.getClass(), "playVsCount", -855399584);
        setIntField(term4270907, term4270907.getClass(), "playSyncCount", -63109837);
        setIntField(term4270907, term4270907.getClass(), "winCount", -1313964845);
        setIntField(term4270907, term4270907.getClass(), "helpCount", -900884066);
        setIntField(term4270907, term4270907.getClass(), "comboCount", -1139610776);
        setLongField(term4270907, term4270907.getClass(), "totalDeluxscore", 599459566782184180L);
        setLongField(term4270907, term4270907.getClass(), "totalBasicDeluxscore", -1590632324372721218L);
        setLongField(term4270907, term4270907.getClass(), "totalAdvancedDeluxscore", -912494046018009646L);
        setLongField(term4270907, term4270907.getClass(), "totalExpertDeluxscore", -1218249974925866064L);
        setLongField(term4270907, term4270907.getClass(), "totalMasterDeluxscore", -4962640845951201096L);
        setLongField(term4270907, term4270907.getClass(), "totalReMasterDeluxscore", -5886264217511843367L);
        setIntField(term4270907, term4270907.getClass(), "totalSync", -176014760);
        setIntField(term4270907, term4270907.getClass(), "totalBasicSync", 1883620700);
        setIntField(term4270907, term4270907.getClass(), "totalAdvancedSync", -1743536941);
        setIntField(term4270907, term4270907.getClass(), "totalExpertSync", -2037299741);
        setIntField(term4270907, term4270907.getClass(), "totalMasterSync", -450799699);
        setIntField(term4270907, term4270907.getClass(), "totalReMasterSync", 359740690);
        setLongField(term4270907, term4270907.getClass(), "totalAchievement", -693769805742229856L);
        setLongField(term4270907, term4270907.getClass(), "totalBasicAchievement", 4649451332707420682L);
        setLongField(term4270907, term4270907.getClass(), "totalAdvancedAchievement", 4194813037210471631L);
        setLongField(term4270907, term4270907.getClass(), "totalExpertAchievement", -8069349611636762364L);
        setLongField(term4270907, term4270907.getClass(), "totalMasterAchievement", -7108300376374487751L);
        setLongField(term4270907, term4270907.getClass(), "totalReMasterAchievement", 7136081319582016901L);
        setLongField(term4270907, term4270907.getClass(), "playerOldRating", 1430579415951438627L);
        setLongField(term4270907, term4270907.getClass(), "playerNewRating", 2538009238408585093L);
        setIntField(term4270907, term4270907.getClass(), "banState", 1529821705);
        setLongField(term4270907, term4270907.getClass(), "dateTime", 5855374214242207242L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerOldRating", argTypes, term4270907, args);
    }

};


