package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserMusicDetail_setBattleScoreMax_46901047826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415631;
     Object term415912;

    public UserMusicDetail_setBattleScoreMax_46901047826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term415637 = new Long(2777168805269959396L);
        term415631 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term415633 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term415635 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term415651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term415652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term415656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term415661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term415662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term415666 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term415631, term415631.getClass(), "id", 1569150938099205354L);
        setLongField(term415633, term415633.getClass(), "id", -7132313198349147690L);
        setLongField(term415635, term415635.getClass(), "id", -4313655453356633032L);
        setField(term415635, term415635.getClass(), "extId", term415637);
        setField(term415635, term415635.getClass(), "luid", "JYQgFcnVcZ");
        setIntField(term415652, term415652.getClass(), "year", 2015);
        setShortField(term415652, term415652.getClass(), "month", (short) 2);
        setShortField(term415652, term415652.getClass(), "day", (short) 11);
        setField(term415651, term415651.getClass(), "date", term415652);
        setByteField(term415656, term415656.getClass(), "hour", (byte) 0);
        setByteField(term415656, term415656.getClass(), "minute", (byte) 33);
        setByteField(term415656, term415656.getClass(), "second", (byte) 13);
        setIntField(term415656, term415656.getClass(), "nano", 262072099);
        setField(term415651, term415651.getClass(), "time", term415656);
        setField(term415635, term415635.getClass(), "registerTime", term415651);
        setIntField(term415662, term415662.getClass(), "year", 2022);
        setShortField(term415662, term415662.getClass(), "month", (short) 11);
        setShortField(term415662, term415662.getClass(), "day", (short) 17);
        setField(term415661, term415661.getClass(), "date", term415662);
        setByteField(term415666, term415666.getClass(), "hour", (byte) 19);
        setByteField(term415666, term415666.getClass(), "minute", (byte) 19);
        setByteField(term415666, term415666.getClass(), "second", (byte) 22);
        setIntField(term415666, term415666.getClass(), "nano", 814949470);
        setField(term415661, term415661.getClass(), "time", term415666);
        setField(term415635, term415635.getClass(), "accessTime", term415661);
        setField(term415633, term415633.getClass(), "card", term415635);
        setField(term415633, term415633.getClass(), "userName", "NyBkXEFvaP");
        setIntField(term415633, term415633.getClass(), "level", -1570295909);
        setIntField(term415633, term415633.getClass(), "reincarnationNum", 1827742156);
        setLongField(term415633, term415633.getClass(), "exp", -679173379838809515L);
        setLongField(term415633, term415633.getClass(), "point", 9043629966242144155L);
        setLongField(term415633, term415633.getClass(), "totalPoint", -911179719824078941L);
        setIntField(term415633, term415633.getClass(), "playCount", 1311629037);
        setIntField(term415633, term415633.getClass(), "jewelCount", -1777826361);
        setIntField(term415633, term415633.getClass(), "totalJewelCount", 512864691);
        setIntField(term415633, term415633.getClass(), "medalCount", 274058319);
        setIntField(term415633, term415633.getClass(), "playerRating", -1962640215);
        setIntField(term415633, term415633.getClass(), "highestRating", -22554739);
        setIntField(term415633, term415633.getClass(), "battlePoint", -1275944573);
        setIntField(term415633, term415633.getClass(), "bestBattlePoint", -1055527447);
        setIntField(term415633, term415633.getClass(), "overDamageBattlePoint", -1122677962);
        setBooleanField(term415633, term415633.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term415633, term415633.getClass(), "nameplateId", 2105835169);
        setIntField(term415633, term415633.getClass(), "trophyId", -711690813);
        setIntField(term415633, term415633.getClass(), "cardId", 1759736252);
        setIntField(term415633, term415633.getClass(), "characterId", -1791645784);
        setIntField(term415633, term415633.getClass(), "characterVoiceNo", 2002305054);
        setIntField(term415633, term415633.getClass(), "tabSetting", -1567580015);
        setIntField(term415633, term415633.getClass(), "tabSortSetting", 2021999751);
        setIntField(term415633, term415633.getClass(), "cardCategorySetting", 1663696920);
        setIntField(term415633, term415633.getClass(), "cardSortSetting", 35955896);
        setIntField(term415633, term415633.getClass(), "rivalScoreCategorySetting", 1014028418);
        setIntField(term415633, term415633.getClass(), "playedTutorialBit", -849647066);
        setIntField(term415633, term415633.getClass(), "firstTutorialCancelNum", -941124386);
        setLongField(term415633, term415633.getClass(), "sumTechHighScore", -1860830851584420115L);
        setLongField(term415633, term415633.getClass(), "sumTechBasicHighScore", -2836722503185918333L);
        setLongField(term415633, term415633.getClass(), "sumTechAdvancedHighScore", -2690938306433058856L);
        setLongField(term415633, term415633.getClass(), "sumTechExpertHighScore", 2459915712064602277L);
        setLongField(term415633, term415633.getClass(), "sumTechMasterHighScore", -4967100446317415784L);
        setLongField(term415633, term415633.getClass(), "sumTechLunaticHighScore", 8108485330694764806L);
        setLongField(term415633, term415633.getClass(), "sumBattleHighScore", 4845210974178318085L);
        setLongField(term415633, term415633.getClass(), "sumBattleBasicHighScore", -6678303826555921769L);
        setLongField(term415633, term415633.getClass(), "sumBattleAdvancedHighScore", 2245065303321972176L);
        setLongField(term415633, term415633.getClass(), "sumBattleExpertHighScore", -5908197012360704740L);
        setLongField(term415633, term415633.getClass(), "sumBattleMasterHighScore", -4720191949651910132L);
        setLongField(term415633, term415633.getClass(), "sumBattleLunaticHighScore", -3897704817003965353L);
        setField(term415633, term415633.getClass(), "eventWatchedDate", "vxadvvhZEP");
        setField(term415633, term415633.getClass(), "cmEventWatchedDate", "DLIhxzmVPH");
        setField(term415633, term415633.getClass(), "firstGameId", "vqQYCwmrvW");
        setField(term415633, term415633.getClass(), "firstRomVersion", "KYrCtMzGIl");
        setField(term415633, term415633.getClass(), "firstDataVersion", "TNaLmmFIrR");
        setField(term415633, term415633.getClass(), "firstPlayDate", "lDerdNwdHd");
        setField(term415633, term415633.getClass(), "lastGameId", "qmKqiOOwFS");
        setField(term415633, term415633.getClass(), "lastRomVersion", "VbdJFUpWfz");
        setField(term415633, term415633.getClass(), "lastDataVersion", "sJvHbsaFIe");
        setField(term415633, term415633.getClass(), "compatibleCmVersion", "xLsvPrUnrp");
        setField(term415633, term415633.getClass(), "lastPlayDate", "vBXrLINQDx");
        setIntField(term415633, term415633.getClass(), "lastPlaceId", 313652185);
        setField(term415633, term415633.getClass(), "lastPlaceName", "kgPknlIWix");
        setIntField(term415633, term415633.getClass(), "lastRegionId", 2033409786);
        setField(term415633, term415633.getClass(), "lastRegionName", "iMSIuZklkW");
        setIntField(term415633, term415633.getClass(), "lastAllNetId", 30435167);
        setField(term415633, term415633.getClass(), "lastClientId", "aGLKuERKQJ");
        setIntField(term415633, term415633.getClass(), "lastUsedDeckId", 1402247424);
        setIntField(term415633, term415633.getClass(), "lastPlayMusicLevel", 1656372492);
        setIntField(term415633, term415633.getClass(), "lastEmoneyBrand", 1847383997);
        setField(term415631, term415631.getClass(), "user", term415633);
        setIntField(term415631, term415631.getClass(), "musicId", 617677787);
        setIntField(term415631, term415631.getClass(), "level", -1887083036);
        setIntField(term415631, term415631.getClass(), "playCount", -266759266);
        setIntField(term415631, term415631.getClass(), "techScoreMax", 1612154309);
        setIntField(term415631, term415631.getClass(), "techScoreRank", -1905285007);
        setIntField(term415631, term415631.getClass(), "battleScoreMax", 757904973);
        setIntField(term415631, term415631.getClass(), "battleScoreRank", -1090592638);
        setIntField(term415631, term415631.getClass(), "maxComboCount", 302580053);
        setIntField(term415631, term415631.getClass(), "maxOverKill", 1852366250);
        setIntField(term415631, term415631.getClass(), "maxTeamOverKill", -673178492);
        setBooleanField(term415631, term415631.getClass(), "isFullBell", false);
        setBooleanField(term415631, term415631.getClass(), "isFullCombo", true);
        setBooleanField(term415631, term415631.getClass(), "isAllBreake", false);
        setBooleanField(term415631, term415631.getClass(), "isLock", false);
        setIntField(term415631, term415631.getClass(), "clearStatus", -1128993163);
        setBooleanField(term415631, term415631.getClass(), "isStoryWatched", true);
        term415912 = new Integer(1585757006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term415912;
        callMethod(klass, "setBattleScoreMax", argTypes, term415631, args);
    }

};


