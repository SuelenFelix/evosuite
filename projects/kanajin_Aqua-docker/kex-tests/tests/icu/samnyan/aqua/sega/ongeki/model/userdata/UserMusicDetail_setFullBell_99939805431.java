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
import java.lang.Boolean;

public class UserMusicDetail_setFullBell_99939805431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417846;
     Object term418127;

    public UserMusicDetail_setFullBell_99939805431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term417852 = new Long(3573273176206440433L);
        term417846 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term417848 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term417850 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term417866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term417867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term417871 = newInstance(Class.forName("java.time.LocalTime"));
        Object term417876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term417877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term417881 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term417846, term417846.getClass(), "id", -6495136402115473610L);
        setLongField(term417848, term417848.getClass(), "id", 1592324252924213529L);
        setLongField(term417850, term417850.getClass(), "id", -4480003831044598836L);
        setField(term417850, term417850.getClass(), "extId", term417852);
        setField(term417850, term417850.getClass(), "luid", "pFovLxpGkT");
        setIntField(term417867, term417867.getClass(), "year", 2028);
        setShortField(term417867, term417867.getClass(), "month", (short) 2);
        setShortField(term417867, term417867.getClass(), "day", (short) 11);
        setField(term417866, term417866.getClass(), "date", term417867);
        setByteField(term417871, term417871.getClass(), "hour", (byte) 23);
        setByteField(term417871, term417871.getClass(), "minute", (byte) 24);
        setByteField(term417871, term417871.getClass(), "second", (byte) 7);
        setIntField(term417871, term417871.getClass(), "nano", 633114962);
        setField(term417866, term417866.getClass(), "time", term417871);
        setField(term417850, term417850.getClass(), "registerTime", term417866);
        setIntField(term417877, term417877.getClass(), "year", 2022);
        setShortField(term417877, term417877.getClass(), "month", (short) 8);
        setShortField(term417877, term417877.getClass(), "day", (short) 27);
        setField(term417876, term417876.getClass(), "date", term417877);
        setByteField(term417881, term417881.getClass(), "hour", (byte) 2);
        setByteField(term417881, term417881.getClass(), "minute", (byte) 59);
        setByteField(term417881, term417881.getClass(), "second", (byte) 14);
        setIntField(term417881, term417881.getClass(), "nano", 662142703);
        setField(term417876, term417876.getClass(), "time", term417881);
        setField(term417850, term417850.getClass(), "accessTime", term417876);
        setField(term417848, term417848.getClass(), "card", term417850);
        setField(term417848, term417848.getClass(), "userName", "jtWULGCrRL");
        setIntField(term417848, term417848.getClass(), "level", 312428791);
        setIntField(term417848, term417848.getClass(), "reincarnationNum", -1804365407);
        setLongField(term417848, term417848.getClass(), "exp", 8360913946582394505L);
        setLongField(term417848, term417848.getClass(), "point", 5160837661387154936L);
        setLongField(term417848, term417848.getClass(), "totalPoint", -9166463186912552193L);
        setIntField(term417848, term417848.getClass(), "playCount", 673174818);
        setIntField(term417848, term417848.getClass(), "jewelCount", 1507476005);
        setIntField(term417848, term417848.getClass(), "totalJewelCount", 1116852917);
        setIntField(term417848, term417848.getClass(), "medalCount", -606326073);
        setIntField(term417848, term417848.getClass(), "playerRating", 1071436494);
        setIntField(term417848, term417848.getClass(), "highestRating", -2123767612);
        setIntField(term417848, term417848.getClass(), "battlePoint", -1029014935);
        setIntField(term417848, term417848.getClass(), "bestBattlePoint", 1247292634);
        setIntField(term417848, term417848.getClass(), "overDamageBattlePoint", -1761690081);
        setBooleanField(term417848, term417848.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term417848, term417848.getClass(), "nameplateId", -884509273);
        setIntField(term417848, term417848.getClass(), "trophyId", 190439423);
        setIntField(term417848, term417848.getClass(), "cardId", -1449079652);
        setIntField(term417848, term417848.getClass(), "characterId", 1431307178);
        setIntField(term417848, term417848.getClass(), "characterVoiceNo", 2140048047);
        setIntField(term417848, term417848.getClass(), "tabSetting", 1301933328);
        setIntField(term417848, term417848.getClass(), "tabSortSetting", -1129585422);
        setIntField(term417848, term417848.getClass(), "cardCategorySetting", -1679632247);
        setIntField(term417848, term417848.getClass(), "cardSortSetting", -1818030414);
        setIntField(term417848, term417848.getClass(), "rivalScoreCategorySetting", -1937580258);
        setIntField(term417848, term417848.getClass(), "playedTutorialBit", 2047493590);
        setIntField(term417848, term417848.getClass(), "firstTutorialCancelNum", 2132351034);
        setLongField(term417848, term417848.getClass(), "sumTechHighScore", 5951603366161524902L);
        setLongField(term417848, term417848.getClass(), "sumTechBasicHighScore", -6663324307394926940L);
        setLongField(term417848, term417848.getClass(), "sumTechAdvancedHighScore", -3744995751534370168L);
        setLongField(term417848, term417848.getClass(), "sumTechExpertHighScore", -4841625844090245214L);
        setLongField(term417848, term417848.getClass(), "sumTechMasterHighScore", -4433517876393259498L);
        setLongField(term417848, term417848.getClass(), "sumTechLunaticHighScore", -6772032070699766846L);
        setLongField(term417848, term417848.getClass(), "sumBattleHighScore", 6458057051988321750L);
        setLongField(term417848, term417848.getClass(), "sumBattleBasicHighScore", 4938101310288662613L);
        setLongField(term417848, term417848.getClass(), "sumBattleAdvancedHighScore", 7503238398322700509L);
        setLongField(term417848, term417848.getClass(), "sumBattleExpertHighScore", 2734846617172614232L);
        setLongField(term417848, term417848.getClass(), "sumBattleMasterHighScore", -2871591279738072172L);
        setLongField(term417848, term417848.getClass(), "sumBattleLunaticHighScore", 2059348359549591762L);
        setField(term417848, term417848.getClass(), "eventWatchedDate", "QJRdKzhxbX");
        setField(term417848, term417848.getClass(), "cmEventWatchedDate", "HjuLNigSAO");
        setField(term417848, term417848.getClass(), "firstGameId", "WdusomirMn");
        setField(term417848, term417848.getClass(), "firstRomVersion", "LcjtwEHFDm");
        setField(term417848, term417848.getClass(), "firstDataVersion", "JgEMSwlYhC");
        setField(term417848, term417848.getClass(), "firstPlayDate", "gMszdXEQCP");
        setField(term417848, term417848.getClass(), "lastGameId", "CtGQsjGPec");
        setField(term417848, term417848.getClass(), "lastRomVersion", "roLQBCEPvc");
        setField(term417848, term417848.getClass(), "lastDataVersion", "zqJBIhPeFS");
        setField(term417848, term417848.getClass(), "compatibleCmVersion", "FMMTpFoqzj");
        setField(term417848, term417848.getClass(), "lastPlayDate", "lykUtyRiXW");
        setIntField(term417848, term417848.getClass(), "lastPlaceId", 1997907854);
        setField(term417848, term417848.getClass(), "lastPlaceName", "AyiSHlfbFL");
        setIntField(term417848, term417848.getClass(), "lastRegionId", -22007267);
        setField(term417848, term417848.getClass(), "lastRegionName", "MxhgDfEubH");
        setIntField(term417848, term417848.getClass(), "lastAllNetId", -666751342);
        setField(term417848, term417848.getClass(), "lastClientId", "XAJhHQuDar");
        setIntField(term417848, term417848.getClass(), "lastUsedDeckId", -1414423353);
        setIntField(term417848, term417848.getClass(), "lastPlayMusicLevel", -793603711);
        setIntField(term417848, term417848.getClass(), "lastEmoneyBrand", -1549062347);
        setField(term417846, term417846.getClass(), "user", term417848);
        setIntField(term417846, term417846.getClass(), "musicId", -1121833174);
        setIntField(term417846, term417846.getClass(), "level", 848327975);
        setIntField(term417846, term417846.getClass(), "playCount", -3235912);
        setIntField(term417846, term417846.getClass(), "techScoreMax", 1621697478);
        setIntField(term417846, term417846.getClass(), "techScoreRank", 1339829529);
        setIntField(term417846, term417846.getClass(), "battleScoreMax", 845782500);
        setIntField(term417846, term417846.getClass(), "battleScoreRank", 722154021);
        setIntField(term417846, term417846.getClass(), "maxComboCount", -800619348);
        setIntField(term417846, term417846.getClass(), "maxOverKill", -293634240);
        setIntField(term417846, term417846.getClass(), "maxTeamOverKill", 1858871293);
        setBooleanField(term417846, term417846.getClass(), "isFullBell", true);
        setBooleanField(term417846, term417846.getClass(), "isFullCombo", false);
        setBooleanField(term417846, term417846.getClass(), "isAllBreake", false);
        setBooleanField(term417846, term417846.getClass(), "isLock", true);
        setIntField(term417846, term417846.getClass(), "clearStatus", -1073531755);
        setBooleanField(term417846, term417846.getClass(), "isStoryWatched", false);
        term418127 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term418127;
        callMethod(klass, "setFullBell", argTypes, term417846, args);
    }

};


