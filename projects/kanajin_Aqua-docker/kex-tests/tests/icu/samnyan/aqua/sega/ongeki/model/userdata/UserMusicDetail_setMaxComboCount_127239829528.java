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

public class UserMusicDetail_setMaxComboCount_127239829528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416517;
     Object term416798;

    public UserMusicDetail_setMaxComboCount_127239829528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term416523 = new Long(-8859332911664940963L);
        term416517 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term416519 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term416521 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term416537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term416538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term416542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term416547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term416548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term416552 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term416517, term416517.getClass(), "id", 3222185687256900589L);
        setLongField(term416519, term416519.getClass(), "id", 5057453109460343132L);
        setLongField(term416521, term416521.getClass(), "id", -6591600352599035339L);
        setField(term416521, term416521.getClass(), "extId", term416523);
        setField(term416521, term416521.getClass(), "luid", "EKyMaiRaVu");
        setIntField(term416538, term416538.getClass(), "year", 2011);
        setShortField(term416538, term416538.getClass(), "month", (short) 4);
        setShortField(term416538, term416538.getClass(), "day", (short) 28);
        setField(term416537, term416537.getClass(), "date", term416538);
        setByteField(term416542, term416542.getClass(), "hour", (byte) 14);
        setByteField(term416542, term416542.getClass(), "minute", (byte) 2);
        setByteField(term416542, term416542.getClass(), "second", (byte) 4);
        setIntField(term416542, term416542.getClass(), "nano", 157796716);
        setField(term416537, term416537.getClass(), "time", term416542);
        setField(term416521, term416521.getClass(), "registerTime", term416537);
        setIntField(term416548, term416548.getClass(), "year", 2018);
        setShortField(term416548, term416548.getClass(), "month", (short) 3);
        setShortField(term416548, term416548.getClass(), "day", (short) 4);
        setField(term416547, term416547.getClass(), "date", term416548);
        setByteField(term416552, term416552.getClass(), "hour", (byte) 14);
        setByteField(term416552, term416552.getClass(), "minute", (byte) 21);
        setByteField(term416552, term416552.getClass(), "second", (byte) 25);
        setIntField(term416552, term416552.getClass(), "nano", 988206373);
        setField(term416547, term416547.getClass(), "time", term416552);
        setField(term416521, term416521.getClass(), "accessTime", term416547);
        setField(term416519, term416519.getClass(), "card", term416521);
        setField(term416519, term416519.getClass(), "userName", "TXmmCeUWEf");
        setIntField(term416519, term416519.getClass(), "level", 1268858295);
        setIntField(term416519, term416519.getClass(), "reincarnationNum", 1662490917);
        setLongField(term416519, term416519.getClass(), "exp", 6519920765145968127L);
        setLongField(term416519, term416519.getClass(), "point", 4183266243697133840L);
        setLongField(term416519, term416519.getClass(), "totalPoint", -3871616420219741944L);
        setIntField(term416519, term416519.getClass(), "playCount", 522964416);
        setIntField(term416519, term416519.getClass(), "jewelCount", 1353910136);
        setIntField(term416519, term416519.getClass(), "totalJewelCount", -1316631090);
        setIntField(term416519, term416519.getClass(), "medalCount", -236092174);
        setIntField(term416519, term416519.getClass(), "playerRating", -1813247118);
        setIntField(term416519, term416519.getClass(), "highestRating", 759725260);
        setIntField(term416519, term416519.getClass(), "battlePoint", 1827062129);
        setIntField(term416519, term416519.getClass(), "bestBattlePoint", 1217241929);
        setIntField(term416519, term416519.getClass(), "overDamageBattlePoint", -1918545885);
        setBooleanField(term416519, term416519.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term416519, term416519.getClass(), "nameplateId", -1288409803);
        setIntField(term416519, term416519.getClass(), "trophyId", -608371748);
        setIntField(term416519, term416519.getClass(), "cardId", -1440272709);
        setIntField(term416519, term416519.getClass(), "characterId", -1247760704);
        setIntField(term416519, term416519.getClass(), "characterVoiceNo", 1923941488);
        setIntField(term416519, term416519.getClass(), "tabSetting", 436079333);
        setIntField(term416519, term416519.getClass(), "tabSortSetting", -323950656);
        setIntField(term416519, term416519.getClass(), "cardCategorySetting", -768927040);
        setIntField(term416519, term416519.getClass(), "cardSortSetting", 374429735);
        setIntField(term416519, term416519.getClass(), "rivalScoreCategorySetting", 91484458);
        setIntField(term416519, term416519.getClass(), "playedTutorialBit", 2070209751);
        setIntField(term416519, term416519.getClass(), "firstTutorialCancelNum", 729636728);
        setLongField(term416519, term416519.getClass(), "sumTechHighScore", 7063134527071299103L);
        setLongField(term416519, term416519.getClass(), "sumTechBasicHighScore", -4325853960275348616L);
        setLongField(term416519, term416519.getClass(), "sumTechAdvancedHighScore", -331842867795420964L);
        setLongField(term416519, term416519.getClass(), "sumTechExpertHighScore", 8392946115802110596L);
        setLongField(term416519, term416519.getClass(), "sumTechMasterHighScore", -6006253203138617378L);
        setLongField(term416519, term416519.getClass(), "sumTechLunaticHighScore", -7301781620395747211L);
        setLongField(term416519, term416519.getClass(), "sumBattleHighScore", -1279280310975162789L);
        setLongField(term416519, term416519.getClass(), "sumBattleBasicHighScore", 6328996063570507727L);
        setLongField(term416519, term416519.getClass(), "sumBattleAdvancedHighScore", 1734430856015476207L);
        setLongField(term416519, term416519.getClass(), "sumBattleExpertHighScore", 2994963304529650869L);
        setLongField(term416519, term416519.getClass(), "sumBattleMasterHighScore", 8040737376228667547L);
        setLongField(term416519, term416519.getClass(), "sumBattleLunaticHighScore", -8590557140420968309L);
        setField(term416519, term416519.getClass(), "eventWatchedDate", "AZaWBdlSyQ");
        setField(term416519, term416519.getClass(), "cmEventWatchedDate", "oJNevBZKbY");
        setField(term416519, term416519.getClass(), "firstGameId", "wXwpHLIGIn");
        setField(term416519, term416519.getClass(), "firstRomVersion", "xvLqipJwqw");
        setField(term416519, term416519.getClass(), "firstDataVersion", "dMnOktjlVy");
        setField(term416519, term416519.getClass(), "firstPlayDate", "VlSRjnaxzS");
        setField(term416519, term416519.getClass(), "lastGameId", "UZVLYtcUSl");
        setField(term416519, term416519.getClass(), "lastRomVersion", "hvUZheJnNP");
        setField(term416519, term416519.getClass(), "lastDataVersion", "FBxEXiKIvM");
        setField(term416519, term416519.getClass(), "compatibleCmVersion", "BOccSMxBaN");
        setField(term416519, term416519.getClass(), "lastPlayDate", "YAZTbmDTFA");
        setIntField(term416519, term416519.getClass(), "lastPlaceId", -1684853062);
        setField(term416519, term416519.getClass(), "lastPlaceName", "qnybNiHwwQ");
        setIntField(term416519, term416519.getClass(), "lastRegionId", -2146771063);
        setField(term416519, term416519.getClass(), "lastRegionName", "NHJNAkPQrj");
        setIntField(term416519, term416519.getClass(), "lastAllNetId", -177815311);
        setField(term416519, term416519.getClass(), "lastClientId", "uSrNHtSNNq");
        setIntField(term416519, term416519.getClass(), "lastUsedDeckId", -497305427);
        setIntField(term416519, term416519.getClass(), "lastPlayMusicLevel", -1741689278);
        setIntField(term416519, term416519.getClass(), "lastEmoneyBrand", 2059178452);
        setField(term416517, term416517.getClass(), "user", term416519);
        setIntField(term416517, term416517.getClass(), "musicId", -684471281);
        setIntField(term416517, term416517.getClass(), "level", -272768917);
        setIntField(term416517, term416517.getClass(), "playCount", -1466239022);
        setIntField(term416517, term416517.getClass(), "techScoreMax", -1584905531);
        setIntField(term416517, term416517.getClass(), "techScoreRank", -179101143);
        setIntField(term416517, term416517.getClass(), "battleScoreMax", 1753851412);
        setIntField(term416517, term416517.getClass(), "battleScoreRank", -2003045633);
        setIntField(term416517, term416517.getClass(), "maxComboCount", 610364207);
        setIntField(term416517, term416517.getClass(), "maxOverKill", -441070510);
        setIntField(term416517, term416517.getClass(), "maxTeamOverKill", 2121753275);
        setBooleanField(term416517, term416517.getClass(), "isFullBell", false);
        setBooleanField(term416517, term416517.getClass(), "isFullCombo", true);
        setBooleanField(term416517, term416517.getClass(), "isAllBreake", true);
        setBooleanField(term416517, term416517.getClass(), "isLock", true);
        setIntField(term416517, term416517.getClass(), "clearStatus", -897069662);
        setBooleanField(term416517, term416517.getClass(), "isStoryWatched", true);
        term416798 = new Integer(-1326530442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term416798;
        callMethod(klass, "setMaxComboCount", argTypes, term416517, args);
    }

};


