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

public class UserStory_hashCode_137133950019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166254;

    public UserStory_hashCode_137133950019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term166260 = new Long(4552367707739103094L);
        term166254 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term166256 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term166258 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term166274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166279 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166289 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term166254, term166254.getClass(), "id", 4955370853212845591L);
        setLongField(term166256, term166256.getClass(), "id", 9223314585031555854L);
        setLongField(term166258, term166258.getClass(), "id", -9155416892107621510L);
        setField(term166258, term166258.getClass(), "extId", term166260);
        setField(term166258, term166258.getClass(), "luid", "gbsOQXxQpC");
        setIntField(term166275, term166275.getClass(), "year", 2025);
        setShortField(term166275, term166275.getClass(), "month", (short) 9);
        setShortField(term166275, term166275.getClass(), "day", (short) 30);
        setField(term166274, term166274.getClass(), "date", term166275);
        setByteField(term166279, term166279.getClass(), "hour", (byte) 1);
        setByteField(term166279, term166279.getClass(), "minute", (byte) 24);
        setByteField(term166279, term166279.getClass(), "second", (byte) 57);
        setIntField(term166279, term166279.getClass(), "nano", 411199118);
        setField(term166274, term166274.getClass(), "time", term166279);
        setField(term166258, term166258.getClass(), "registerTime", term166274);
        setIntField(term166285, term166285.getClass(), "year", 2017);
        setShortField(term166285, term166285.getClass(), "month", (short) 5);
        setShortField(term166285, term166285.getClass(), "day", (short) 18);
        setField(term166284, term166284.getClass(), "date", term166285);
        setByteField(term166289, term166289.getClass(), "hour", (byte) 16);
        setByteField(term166289, term166289.getClass(), "minute", (byte) 29);
        setByteField(term166289, term166289.getClass(), "second", (byte) 6);
        setIntField(term166289, term166289.getClass(), "nano", 770428301);
        setField(term166284, term166284.getClass(), "time", term166289);
        setField(term166258, term166258.getClass(), "accessTime", term166284);
        setField(term166256, term166256.getClass(), "card", term166258);
        setField(term166256, term166256.getClass(), "userName", "LWdCGlgTfg");
        setIntField(term166256, term166256.getClass(), "level", -1045178381);
        setIntField(term166256, term166256.getClass(), "reincarnationNum", -1427049200);
        setLongField(term166256, term166256.getClass(), "exp", -5044427064349686382L);
        setLongField(term166256, term166256.getClass(), "point", -1968754509723632094L);
        setLongField(term166256, term166256.getClass(), "totalPoint", -2859832295320127160L);
        setIntField(term166256, term166256.getClass(), "playCount", -911265650);
        setIntField(term166256, term166256.getClass(), "jewelCount", 218864889);
        setIntField(term166256, term166256.getClass(), "totalJewelCount", -1988994618);
        setIntField(term166256, term166256.getClass(), "medalCount", 1551865443);
        setIntField(term166256, term166256.getClass(), "playerRating", -1883739433);
        setIntField(term166256, term166256.getClass(), "highestRating", -492305893);
        setIntField(term166256, term166256.getClass(), "battlePoint", -1969736424);
        setIntField(term166256, term166256.getClass(), "bestBattlePoint", 1464895284);
        setIntField(term166256, term166256.getClass(), "overDamageBattlePoint", 1538680141);
        setBooleanField(term166256, term166256.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term166256, term166256.getClass(), "nameplateId", -506059418);
        setIntField(term166256, term166256.getClass(), "trophyId", -1577159884);
        setIntField(term166256, term166256.getClass(), "cardId", -863958105);
        setIntField(term166256, term166256.getClass(), "characterId", 622092405);
        setIntField(term166256, term166256.getClass(), "characterVoiceNo", -1454644959);
        setIntField(term166256, term166256.getClass(), "tabSetting", 101535830);
        setIntField(term166256, term166256.getClass(), "tabSortSetting", 1139143083);
        setIntField(term166256, term166256.getClass(), "cardCategorySetting", 1041163234);
        setIntField(term166256, term166256.getClass(), "cardSortSetting", 698385520);
        setIntField(term166256, term166256.getClass(), "rivalScoreCategorySetting", 849449580);
        setIntField(term166256, term166256.getClass(), "playedTutorialBit", 223713903);
        setIntField(term166256, term166256.getClass(), "firstTutorialCancelNum", 1671953554);
        setLongField(term166256, term166256.getClass(), "sumTechHighScore", -2366725071582546648L);
        setLongField(term166256, term166256.getClass(), "sumTechBasicHighScore", 2182468870423520358L);
        setLongField(term166256, term166256.getClass(), "sumTechAdvancedHighScore", 3752534101168263720L);
        setLongField(term166256, term166256.getClass(), "sumTechExpertHighScore", 2058442714191216609L);
        setLongField(term166256, term166256.getClass(), "sumTechMasterHighScore", -7602494537520939705L);
        setLongField(term166256, term166256.getClass(), "sumTechLunaticHighScore", 2023870659468031248L);
        setLongField(term166256, term166256.getClass(), "sumBattleHighScore", 2046699291961773430L);
        setLongField(term166256, term166256.getClass(), "sumBattleBasicHighScore", 2398640011723725199L);
        setLongField(term166256, term166256.getClass(), "sumBattleAdvancedHighScore", 786157991151108343L);
        setLongField(term166256, term166256.getClass(), "sumBattleExpertHighScore", 6961497905863738725L);
        setLongField(term166256, term166256.getClass(), "sumBattleMasterHighScore", 4889943794113542688L);
        setLongField(term166256, term166256.getClass(), "sumBattleLunaticHighScore", -6999458605350230167L);
        setField(term166256, term166256.getClass(), "eventWatchedDate", "UpyBgDHcdi");
        setField(term166256, term166256.getClass(), "cmEventWatchedDate", "RqaFAWpQyj");
        setField(term166256, term166256.getClass(), "firstGameId", "QQKFcxEaGP");
        setField(term166256, term166256.getClass(), "firstRomVersion", "wFsiyFrJKB");
        setField(term166256, term166256.getClass(), "firstDataVersion", "yelhWAUxar");
        setField(term166256, term166256.getClass(), "firstPlayDate", "ilexmkxnnT");
        setField(term166256, term166256.getClass(), "lastGameId", "siHmeMSTNO");
        setField(term166256, term166256.getClass(), "lastRomVersion", "APXHyxjcwO");
        setField(term166256, term166256.getClass(), "lastDataVersion", "isXXbgmiXb");
        setField(term166256, term166256.getClass(), "compatibleCmVersion", "gUlYEYataN");
        setField(term166256, term166256.getClass(), "lastPlayDate", "BAECjpdLZS");
        setIntField(term166256, term166256.getClass(), "lastPlaceId", 478755818);
        setField(term166256, term166256.getClass(), "lastPlaceName", "DRHCrDiVfM");
        setIntField(term166256, term166256.getClass(), "lastRegionId", -1272313823);
        setField(term166256, term166256.getClass(), "lastRegionName", "xnIAaGyqEt");
        setIntField(term166256, term166256.getClass(), "lastAllNetId", -872110316);
        setField(term166256, term166256.getClass(), "lastClientId", "aJASPPtPMs");
        setIntField(term166256, term166256.getClass(), "lastUsedDeckId", -1523155561);
        setIntField(term166256, term166256.getClass(), "lastPlayMusicLevel", 538636137);
        setIntField(term166256, term166256.getClass(), "lastEmoneyBrand", 1198486550);
        setField(term166254, term166254.getClass(), "user", term166256);
        setIntField(term166254, term166254.getClass(), "storyId", 1991523491);
        setIntField(term166254, term166254.getClass(), "lastChapterId", 1175856889);
        setIntField(term166254, term166254.getClass(), "jewelCount", -1544836830);
        setIntField(term166254, term166254.getClass(), "lastPlayMusicId", 836331634);
        setIntField(term166254, term166254.getClass(), "lastPlayMusicCategory", -1611918528);
        setIntField(term166254, term166254.getClass(), "lastPlayMusicLevel", -1007102246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term166254, args);
    }

};


