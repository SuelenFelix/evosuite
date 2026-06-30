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

public class UserDetail_setLastCountryCode_987814724113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4293920;

    public UserDetail_setLastCountryCode_987814724113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4293924 = new Long(1588032528014963437L);
        Integer term4293987 = new Integer(-1244991565);
        Integer term4293989 = new Integer(-865604268);
        ArrayList term4293985 = new ArrayList();
        ((ArrayList) term4293985).add(term4293987);
        ((ArrayList) term4293985).add(term4293989);
        Integer term4293995 = new Integer(-629271467);
        ArrayList term4293993 = new ArrayList();
        ((ArrayList) term4293993).add(term4293995);
        term4293920 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4293922 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4293938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4293939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4293943 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4293948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4293949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4293953 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4293920, term4293920.getClass(), "id", 2134745339180989381L);
        setLongField(term4293922, term4293922.getClass(), "id", -2026564330939405357L);
        setField(term4293922, term4293922.getClass(), "extId", term4293924);
        setField(term4293922, term4293922.getClass(), "luid", "pzDslhcAwy");
        setIntField(term4293939, term4293939.getClass(), "year", 2017);
        setShortField(term4293939, term4293939.getClass(), "month", (short) 9);
        setShortField(term4293939, term4293939.getClass(), "day", (short) 15);
        setField(term4293938, term4293938.getClass(), "date", term4293939);
        setByteField(term4293943, term4293943.getClass(), "hour", (byte) 19);
        setByteField(term4293943, term4293943.getClass(), "minute", (byte) 46);
        setByteField(term4293943, term4293943.getClass(), "second", (byte) 21);
        setIntField(term4293943, term4293943.getClass(), "nano", 401618259);
        setField(term4293938, term4293938.getClass(), "time", term4293943);
        setField(term4293922, term4293922.getClass(), "registerTime", term4293938);
        setIntField(term4293949, term4293949.getClass(), "year", 2019);
        setShortField(term4293949, term4293949.getClass(), "month", (short) 2);
        setShortField(term4293949, term4293949.getClass(), "day", (short) 21);
        setField(term4293948, term4293948.getClass(), "date", term4293949);
        setByteField(term4293953, term4293953.getClass(), "hour", (byte) 3);
        setByteField(term4293953, term4293953.getClass(), "minute", (byte) 53);
        setByteField(term4293953, term4293953.getClass(), "second", (byte) 13);
        setIntField(term4293953, term4293953.getClass(), "nano", 481465143);
        setField(term4293948, term4293948.getClass(), "time", term4293953);
        setField(term4293922, term4293922.getClass(), "accessTime", term4293948);
        setField(term4293920, term4293920.getClass(), "card", term4293922);
        setField(term4293920, term4293920.getClass(), "userName", "LMDskpBBVf");
        setIntField(term4293920, term4293920.getClass(), "isNetMember", -396959238);
        setIntField(term4293920, term4293920.getClass(), "iconId", -1664897206);
        setIntField(term4293920, term4293920.getClass(), "plateId", -826767748);
        setIntField(term4293920, term4293920.getClass(), "titleId", -310315819);
        setIntField(term4293920, term4293920.getClass(), "partnerId", -921901517);
        setIntField(term4293920, term4293920.getClass(), "frameId", -988715494);
        setIntField(term4293920, term4293920.getClass(), "selectMapId", -226461400);
        setIntField(term4293920, term4293920.getClass(), "totalAwake", -90394939);
        setIntField(term4293920, term4293920.getClass(), "gradeRating", 310362430);
        setIntField(term4293920, term4293920.getClass(), "musicRating", 1556685405);
        setIntField(term4293920, term4293920.getClass(), "playerRating", 1208965462);
        setIntField(term4293920, term4293920.getClass(), "highestRating", -7216305);
        setIntField(term4293920, term4293920.getClass(), "gradeRank", 312310360);
        setIntField(term4293920, term4293920.getClass(), "classRank", 932156474);
        setIntField(term4293920, term4293920.getClass(), "courseRank", 2074080973);
        setField(term4293920, term4293920.getClass(), "charaSlot", term4293985);
        setField(term4293920, term4293920.getClass(), "charaLockSlot", term4293993);
        setLongField(term4293920, term4293920.getClass(), "contentBit", 8316442613862679349L);
        setIntField(term4293920, term4293920.getClass(), "playCount", 1250020080);
        setField(term4293920, term4293920.getClass(), "eventWatchedDate", "yWERFKNeFq");
        setField(term4293920, term4293920.getClass(), "lastGameId", "UzzfFVsskg");
        setField(term4293920, term4293920.getClass(), "lastRomVersion", "QGrnsrDnox");
        setField(term4293920, term4293920.getClass(), "lastDataVersion", "QxmEqzpHFG");
        setField(term4293920, term4293920.getClass(), "lastLoginDate", "KxoThZCaaj");
        setField(term4293920, term4293920.getClass(), "lastPlayDate", "dJWGMaVuAu");
        setIntField(term4293920, term4293920.getClass(), "lastPlayCredit", 454066680);
        setIntField(term4293920, term4293920.getClass(), "lastPlayMode", -1982243843);
        setIntField(term4293920, term4293920.getClass(), "lastPlaceId", -244800120);
        setField(term4293920, term4293920.getClass(), "lastPlaceName", "brkaMIfTlS");
        setIntField(term4293920, term4293920.getClass(), "lastAllNetId", -1510955328);
        setIntField(term4293920, term4293920.getClass(), "lastRegionId", -2144427688);
        setField(term4293920, term4293920.getClass(), "lastRegionName", "AWtGYPsCOr");
        setField(term4293920, term4293920.getClass(), "lastClientId", "LlMyhOtrrV");
        setField(term4293920, term4293920.getClass(), "lastCountryCode", "JvEdeIvhAC");
        setIntField(term4293920, term4293920.getClass(), "lastSelectEMoney", 1703386447);
        setIntField(term4293920, term4293920.getClass(), "lastSelectTicket", 1282843358);
        setIntField(term4293920, term4293920.getClass(), "lastSelectCourse", 1446914245);
        setIntField(term4293920, term4293920.getClass(), "lastCountCourse", -1201086924);
        setField(term4293920, term4293920.getClass(), "firstGameId", "ZYwNmpleAD");
        setField(term4293920, term4293920.getClass(), "firstRomVersion", "RMgioDKVPc");
        setField(term4293920, term4293920.getClass(), "firstDataVersion", "xFgFIUcVPk");
        setField(term4293920, term4293920.getClass(), "firstPlayDate", "BDBajquGHw");
        setField(term4293920, term4293920.getClass(), "compatibleCmVersion", "JNYBVzmxiI");
        setField(term4293920, term4293920.getClass(), "dailyBonusDate", "APjtdZqgTT");
        setField(term4293920, term4293920.getClass(), "dailyCourseBonusDate", "pDNXAzMHwa");
        setField(term4293920, term4293920.getClass(), "lastPairLoginDate", "lbjPZeJqCY");
        setField(term4293920, term4293920.getClass(), "lastTrialPlayDate", "PTirGdNqIc");
        setIntField(term4293920, term4293920.getClass(), "playVsCount", -1814163033);
        setIntField(term4293920, term4293920.getClass(), "playSyncCount", -336058142);
        setIntField(term4293920, term4293920.getClass(), "winCount", -1748267643);
        setIntField(term4293920, term4293920.getClass(), "helpCount", 971986641);
        setIntField(term4293920, term4293920.getClass(), "comboCount", 2007191040);
        setLongField(term4293920, term4293920.getClass(), "totalDeluxscore", 4911094258576453659L);
        setLongField(term4293920, term4293920.getClass(), "totalBasicDeluxscore", 5420275082712591280L);
        setLongField(term4293920, term4293920.getClass(), "totalAdvancedDeluxscore", -4534222955437963432L);
        setLongField(term4293920, term4293920.getClass(), "totalExpertDeluxscore", -2612330610010982197L);
        setLongField(term4293920, term4293920.getClass(), "totalMasterDeluxscore", -4261909570316404095L);
        setLongField(term4293920, term4293920.getClass(), "totalReMasterDeluxscore", -8161865709352790011L);
        setIntField(term4293920, term4293920.getClass(), "totalSync", -1953901556);
        setIntField(term4293920, term4293920.getClass(), "totalBasicSync", 1416706780);
        setIntField(term4293920, term4293920.getClass(), "totalAdvancedSync", -1377281472);
        setIntField(term4293920, term4293920.getClass(), "totalExpertSync", -1307365428);
        setIntField(term4293920, term4293920.getClass(), "totalMasterSync", 1430404888);
        setIntField(term4293920, term4293920.getClass(), "totalReMasterSync", -1364264944);
        setLongField(term4293920, term4293920.getClass(), "totalAchievement", 1314165366964464166L);
        setLongField(term4293920, term4293920.getClass(), "totalBasicAchievement", -3946314788938732245L);
        setLongField(term4293920, term4293920.getClass(), "totalAdvancedAchievement", -91195294759171220L);
        setLongField(term4293920, term4293920.getClass(), "totalExpertAchievement", -5462923943313538818L);
        setLongField(term4293920, term4293920.getClass(), "totalMasterAchievement", -2527303834580192938L);
        setLongField(term4293920, term4293920.getClass(), "totalReMasterAchievement", 8143158443719702034L);
        setLongField(term4293920, term4293920.getClass(), "playerOldRating", -276184499904616891L);
        setLongField(term4293920, term4293920.getClass(), "playerNewRating", -1664561992071206920L);
        setIntField(term4293920, term4293920.getClass(), "banState", -1865793309);
        setLongField(term4293920, term4293920.getClass(), "dateTime", 2262757998191598017L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kkAIpJwxjP";
        callMethod(klass, "setLastCountryCode", argTypes, term4293920, args);
    }

};


