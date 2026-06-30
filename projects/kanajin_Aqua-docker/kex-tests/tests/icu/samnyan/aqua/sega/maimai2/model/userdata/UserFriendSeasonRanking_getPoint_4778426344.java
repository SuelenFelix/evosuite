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

public class UserFriendSeasonRanking_getPoint_4778426344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17030;

    public UserFriendSeasonRanking_getPoint_4778426344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17036 = new Long(2120084523938730454L);
        Integer term17099 = new Integer(1460722225);
        Integer term17101 = new Integer(1743224434);
        Integer term17103 = new Integer(842904495);
        Integer term17105 = new Integer(1008080511);
        Integer term17107 = new Integer(1935707624);
        Integer term17109 = new Integer(1507074215);
        Integer term17111 = new Integer(-282881827);
        Integer term17113 = new Integer(-1183353915);
        Integer term17115 = new Integer(-420030135);
        ArrayList term17097 = new ArrayList();
        ((ArrayList) term17097).add(term17099);
        ((ArrayList) term17097).add(term17101);
        ((ArrayList) term17097).add(term17103);
        ((ArrayList) term17097).add(term17105);
        ((ArrayList) term17097).add(term17107);
        ((ArrayList) term17097).add(term17109);
        ((ArrayList) term17097).add(term17111);
        ((ArrayList) term17097).add(term17113);
        ((ArrayList) term17097).add(term17115);
        Integer term17121 = new Integer(267763294);
        Integer term17123 = new Integer(-1497710478);
        Integer term17125 = new Integer(49950830);
        Integer term17127 = new Integer(-525257914);
        Integer term17129 = new Integer(147209682);
        Integer term17131 = new Integer(34470066);
        Integer term17133 = new Integer(2058711405);
        ArrayList term17119 = new ArrayList();
        ((ArrayList) term17119).add(term17121);
        ((ArrayList) term17119).add(term17123);
        ((ArrayList) term17119).add(term17125);
        ((ArrayList) term17119).add(term17127);
        ((ArrayList) term17119).add(term17129);
        ((ArrayList) term17119).add(term17131);
        ((ArrayList) term17119).add(term17133);
        term17030 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term17032 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term17034 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term17050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17055 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17065 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term17030, term17030.getClass(), "id", 7875739215674729968L);
        setLongField(term17032, term17032.getClass(), "id", -8605430501912680279L);
        setLongField(term17034, term17034.getClass(), "id", 2985226914509512766L);
        setField(term17034, term17034.getClass(), "extId", term17036);
        setField(term17034, term17034.getClass(), "luid", "xmzSoVgiED");
        setIntField(term17051, term17051.getClass(), "year", 2025);
        setShortField(term17051, term17051.getClass(), "month", (short) 3);
        setShortField(term17051, term17051.getClass(), "day", (short) 28);
        setField(term17050, term17050.getClass(), "date", term17051);
        setByteField(term17055, term17055.getClass(), "hour", (byte) 19);
        setByteField(term17055, term17055.getClass(), "minute", (byte) 56);
        setByteField(term17055, term17055.getClass(), "second", (byte) 52);
        setIntField(term17055, term17055.getClass(), "nano", 738558930);
        setField(term17050, term17050.getClass(), "time", term17055);
        setField(term17034, term17034.getClass(), "registerTime", term17050);
        setIntField(term17061, term17061.getClass(), "year", 2024);
        setShortField(term17061, term17061.getClass(), "month", (short) 2);
        setShortField(term17061, term17061.getClass(), "day", (short) 29);
        setField(term17060, term17060.getClass(), "date", term17061);
        setByteField(term17065, term17065.getClass(), "hour", (byte) 17);
        setByteField(term17065, term17065.getClass(), "minute", (byte) 54);
        setByteField(term17065, term17065.getClass(), "second", (byte) 21);
        setIntField(term17065, term17065.getClass(), "nano", 605973408);
        setField(term17060, term17060.getClass(), "time", term17065);
        setField(term17034, term17034.getClass(), "accessTime", term17060);
        setField(term17032, term17032.getClass(), "card", term17034);
        setField(term17032, term17032.getClass(), "userName", "pdSvedKgPq");
        setIntField(term17032, term17032.getClass(), "isNetMember", -308526089);
        setIntField(term17032, term17032.getClass(), "iconId", -359675864);
        setIntField(term17032, term17032.getClass(), "plateId", -1671982964);
        setIntField(term17032, term17032.getClass(), "titleId", 776218451);
        setIntField(term17032, term17032.getClass(), "partnerId", -1362132929);
        setIntField(term17032, term17032.getClass(), "frameId", 1267740164);
        setIntField(term17032, term17032.getClass(), "selectMapId", 1363887997);
        setIntField(term17032, term17032.getClass(), "totalAwake", -1744763945);
        setIntField(term17032, term17032.getClass(), "gradeRating", 852281447);
        setIntField(term17032, term17032.getClass(), "musicRating", 1248430530);
        setIntField(term17032, term17032.getClass(), "playerRating", -1911828505);
        setIntField(term17032, term17032.getClass(), "highestRating", 241725499);
        setIntField(term17032, term17032.getClass(), "gradeRank", 823179298);
        setIntField(term17032, term17032.getClass(), "classRank", 1174484848);
        setIntField(term17032, term17032.getClass(), "courseRank", 939889496);
        setField(term17032, term17032.getClass(), "charaSlot", term17097);
        setField(term17032, term17032.getClass(), "charaLockSlot", term17119);
        setLongField(term17032, term17032.getClass(), "contentBit", 4041117732464806744L);
        setIntField(term17032, term17032.getClass(), "playCount", -495242269);
        setField(term17032, term17032.getClass(), "eventWatchedDate", "epPTwvcoyb");
        setField(term17032, term17032.getClass(), "lastGameId", "UBPHmOICBs");
        setField(term17032, term17032.getClass(), "lastRomVersion", "IDJUVPgUJf");
        setField(term17032, term17032.getClass(), "lastDataVersion", "JmnWRJUxGr");
        setField(term17032, term17032.getClass(), "lastLoginDate", "wgRGBNrTGP");
        setField(term17032, term17032.getClass(), "lastPlayDate", "FIdNVptZpW");
        setIntField(term17032, term17032.getClass(), "lastPlayCredit", 932810106);
        setIntField(term17032, term17032.getClass(), "lastPlayMode", -2138801137);
        setIntField(term17032, term17032.getClass(), "lastPlaceId", -1470115841);
        setField(term17032, term17032.getClass(), "lastPlaceName", "rQjxAhisjm");
        setIntField(term17032, term17032.getClass(), "lastAllNetId", 480909331);
        setIntField(term17032, term17032.getClass(), "lastRegionId", -2024983877);
        setField(term17032, term17032.getClass(), "lastRegionName", "ZDhASPHjDG");
        setField(term17032, term17032.getClass(), "lastClientId", "HNVOAXYNEZ");
        setField(term17032, term17032.getClass(), "lastCountryCode", "gbbYBYyfvr");
        setIntField(term17032, term17032.getClass(), "lastSelectEMoney", 1757149811);
        setIntField(term17032, term17032.getClass(), "lastSelectTicket", 1505375686);
        setIntField(term17032, term17032.getClass(), "lastSelectCourse", -132005524);
        setIntField(term17032, term17032.getClass(), "lastCountCourse", -1235127374);
        setField(term17032, term17032.getClass(), "firstGameId", "SrWMUlbtWV");
        setField(term17032, term17032.getClass(), "firstRomVersion", "VePIumgrrU");
        setField(term17032, term17032.getClass(), "firstDataVersion", "DPwIqlszZo");
        setField(term17032, term17032.getClass(), "firstPlayDate", "mNgDshwZNc");
        setField(term17032, term17032.getClass(), "compatibleCmVersion", "pDqgDbJoFw");
        setField(term17032, term17032.getClass(), "dailyBonusDate", "iVOvTzOxwt");
        setField(term17032, term17032.getClass(), "dailyCourseBonusDate", "BjZQdecXvB");
        setField(term17032, term17032.getClass(), "lastPairLoginDate", "iUkOOQhEkw");
        setField(term17032, term17032.getClass(), "lastTrialPlayDate", "wmVoFoUVmU");
        setIntField(term17032, term17032.getClass(), "playVsCount", -2077814162);
        setIntField(term17032, term17032.getClass(), "playSyncCount", 444514470);
        setIntField(term17032, term17032.getClass(), "winCount", -147055177);
        setIntField(term17032, term17032.getClass(), "helpCount", 1979044375);
        setIntField(term17032, term17032.getClass(), "comboCount", 961252909);
        setLongField(term17032, term17032.getClass(), "totalDeluxscore", 7199459243454109261L);
        setLongField(term17032, term17032.getClass(), "totalBasicDeluxscore", -1009485425289165749L);
        setLongField(term17032, term17032.getClass(), "totalAdvancedDeluxscore", -5044181804110715069L);
        setLongField(term17032, term17032.getClass(), "totalExpertDeluxscore", -2413135395771470086L);
        setLongField(term17032, term17032.getClass(), "totalMasterDeluxscore", -823085399570394644L);
        setLongField(term17032, term17032.getClass(), "totalReMasterDeluxscore", -894705411488729365L);
        setIntField(term17032, term17032.getClass(), "totalSync", 1455842357);
        setIntField(term17032, term17032.getClass(), "totalBasicSync", 1349806561);
        setIntField(term17032, term17032.getClass(), "totalAdvancedSync", 923905351);
        setIntField(term17032, term17032.getClass(), "totalExpertSync", 428360161);
        setIntField(term17032, term17032.getClass(), "totalMasterSync", 631528579);
        setIntField(term17032, term17032.getClass(), "totalReMasterSync", -1652091834);
        setLongField(term17032, term17032.getClass(), "totalAchievement", -7514437039500876647L);
        setLongField(term17032, term17032.getClass(), "totalBasicAchievement", 204473662283899955L);
        setLongField(term17032, term17032.getClass(), "totalAdvancedAchievement", -4029227951294167228L);
        setLongField(term17032, term17032.getClass(), "totalExpertAchievement", 5160033404788124731L);
        setLongField(term17032, term17032.getClass(), "totalMasterAchievement", 5071015720043054072L);
        setLongField(term17032, term17032.getClass(), "totalReMasterAchievement", -7006877527579112761L);
        setLongField(term17032, term17032.getClass(), "playerOldRating", -8699693633047465617L);
        setLongField(term17032, term17032.getClass(), "playerNewRating", -590890905395927244L);
        setIntField(term17032, term17032.getClass(), "banState", -282021579);
        setLongField(term17032, term17032.getClass(), "dateTime", 6978548804004471804L);
        setField(term17030, term17030.getClass(), "user", term17032);
        setIntField(term17030, term17030.getClass(), "seasonId", -1652588127);
        setIntField(term17030, term17030.getClass(), "point", -1902823385);
        setIntField(term17030, term17030.getClass(), "rank", -784924879);
        setBooleanField(term17030, term17030.getClass(), "rewardGet", false);
        setField(term17030, term17030.getClass(), "userName", "lLiSiPCciB");
        setField(term17030, term17030.getClass(), "recordDate", "PsMKIIEwdR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term17030, args);
    }

};


