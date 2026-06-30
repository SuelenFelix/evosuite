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

public class UserCharacter_getUser_10744615192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168619;

    public UserCharacter_getUser_10744615192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term168625 = new Long(9214973322210954344L);
        term168619 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term168621 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term168623 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term168639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168644 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168649 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168650 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168654 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term168619, term168619.getClass(), "id", -6404400134373703541L);
        setLongField(term168621, term168621.getClass(), "id", -797757766423223920L);
        setLongField(term168623, term168623.getClass(), "id", 2045688555375039671L);
        setField(term168623, term168623.getClass(), "extId", term168625);
        setField(term168623, term168623.getClass(), "luid", "PyNONxxRIm");
        setIntField(term168640, term168640.getClass(), "year", 2019);
        setShortField(term168640, term168640.getClass(), "month", (short) 4);
        setShortField(term168640, term168640.getClass(), "day", (short) 21);
        setField(term168639, term168639.getClass(), "date", term168640);
        setByteField(term168644, term168644.getClass(), "hour", (byte) 17);
        setByteField(term168644, term168644.getClass(), "minute", (byte) 1);
        setByteField(term168644, term168644.getClass(), "second", (byte) 1);
        setIntField(term168644, term168644.getClass(), "nano", 802156649);
        setField(term168639, term168639.getClass(), "time", term168644);
        setField(term168623, term168623.getClass(), "registerTime", term168639);
        setIntField(term168650, term168650.getClass(), "year", 2029);
        setShortField(term168650, term168650.getClass(), "month", (short) 8);
        setShortField(term168650, term168650.getClass(), "day", (short) 7);
        setField(term168649, term168649.getClass(), "date", term168650);
        setByteField(term168654, term168654.getClass(), "hour", (byte) 5);
        setByteField(term168654, term168654.getClass(), "minute", (byte) 54);
        setByteField(term168654, term168654.getClass(), "second", (byte) 5);
        setIntField(term168654, term168654.getClass(), "nano", 873009584);
        setField(term168649, term168649.getClass(), "time", term168654);
        setField(term168623, term168623.getClass(), "accessTime", term168649);
        setField(term168621, term168621.getClass(), "card", term168623);
        setField(term168621, term168621.getClass(), "userName", "JLALhNngep");
        setIntField(term168621, term168621.getClass(), "level", 1209639956);
        setIntField(term168621, term168621.getClass(), "reincarnationNum", -1463395842);
        setLongField(term168621, term168621.getClass(), "exp", -820715354224473286L);
        setLongField(term168621, term168621.getClass(), "point", -772135562955984228L);
        setLongField(term168621, term168621.getClass(), "totalPoint", -8435453295822372001L);
        setIntField(term168621, term168621.getClass(), "playCount", -1313344065);
        setIntField(term168621, term168621.getClass(), "jewelCount", 1228398077);
        setIntField(term168621, term168621.getClass(), "totalJewelCount", 110342291);
        setIntField(term168621, term168621.getClass(), "medalCount", 905029929);
        setIntField(term168621, term168621.getClass(), "playerRating", 2106266461);
        setIntField(term168621, term168621.getClass(), "highestRating", 994139397);
        setIntField(term168621, term168621.getClass(), "battlePoint", -1851045959);
        setIntField(term168621, term168621.getClass(), "bestBattlePoint", 2000289703);
        setIntField(term168621, term168621.getClass(), "overDamageBattlePoint", -1629394268);
        setBooleanField(term168621, term168621.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term168621, term168621.getClass(), "nameplateId", -1898311415);
        setIntField(term168621, term168621.getClass(), "trophyId", -139938289);
        setIntField(term168621, term168621.getClass(), "cardId", 495686607);
        setIntField(term168621, term168621.getClass(), "characterId", -1842004522);
        setIntField(term168621, term168621.getClass(), "characterVoiceNo", -2081738821);
        setIntField(term168621, term168621.getClass(), "tabSetting", -791069487);
        setIntField(term168621, term168621.getClass(), "tabSortSetting", 2040131935);
        setIntField(term168621, term168621.getClass(), "cardCategorySetting", -1183833390);
        setIntField(term168621, term168621.getClass(), "cardSortSetting", -479335978);
        setIntField(term168621, term168621.getClass(), "rivalScoreCategorySetting", 1628406480);
        setIntField(term168621, term168621.getClass(), "playedTutorialBit", -282271093);
        setIntField(term168621, term168621.getClass(), "firstTutorialCancelNum", -1014876011);
        setLongField(term168621, term168621.getClass(), "sumTechHighScore", 4870926120312695851L);
        setLongField(term168621, term168621.getClass(), "sumTechBasicHighScore", 5624875115325952335L);
        setLongField(term168621, term168621.getClass(), "sumTechAdvancedHighScore", -9080310106055827773L);
        setLongField(term168621, term168621.getClass(), "sumTechExpertHighScore", 7747202674379406098L);
        setLongField(term168621, term168621.getClass(), "sumTechMasterHighScore", -3120913720963099689L);
        setLongField(term168621, term168621.getClass(), "sumTechLunaticHighScore", -4836831199613890387L);
        setLongField(term168621, term168621.getClass(), "sumBattleHighScore", -5985091787359828019L);
        setLongField(term168621, term168621.getClass(), "sumBattleBasicHighScore", -1556371026742712412L);
        setLongField(term168621, term168621.getClass(), "sumBattleAdvancedHighScore", -2150229403476575447L);
        setLongField(term168621, term168621.getClass(), "sumBattleExpertHighScore", -623600138515789120L);
        setLongField(term168621, term168621.getClass(), "sumBattleMasterHighScore", 3384791734790058474L);
        setLongField(term168621, term168621.getClass(), "sumBattleLunaticHighScore", -5159022687886007790L);
        setField(term168621, term168621.getClass(), "eventWatchedDate", "gMaZghyhSE");
        setField(term168621, term168621.getClass(), "cmEventWatchedDate", "KFemAGjeNe");
        setField(term168621, term168621.getClass(), "firstGameId", "PcFPYKeVcH");
        setField(term168621, term168621.getClass(), "firstRomVersion", "osxxxUzOYV");
        setField(term168621, term168621.getClass(), "firstDataVersion", "TKgvONjuwo");
        setField(term168621, term168621.getClass(), "firstPlayDate", "EfHbKLrlba");
        setField(term168621, term168621.getClass(), "lastGameId", "kTKInMVwKn");
        setField(term168621, term168621.getClass(), "lastRomVersion", "WyXXpLPnjE");
        setField(term168621, term168621.getClass(), "lastDataVersion", "EZqcFiCmkN");
        setField(term168621, term168621.getClass(), "compatibleCmVersion", "InPNCZSdaO");
        setField(term168621, term168621.getClass(), "lastPlayDate", "wqoFYDQVFC");
        setIntField(term168621, term168621.getClass(), "lastPlaceId", -1030632367);
        setField(term168621, term168621.getClass(), "lastPlaceName", "FVPbcnRWsS");
        setIntField(term168621, term168621.getClass(), "lastRegionId", -566251622);
        setField(term168621, term168621.getClass(), "lastRegionName", "sWSwYJRLWw");
        setIntField(term168621, term168621.getClass(), "lastAllNetId", -2094377383);
        setField(term168621, term168621.getClass(), "lastClientId", "hNqPjlwmpW");
        setIntField(term168621, term168621.getClass(), "lastUsedDeckId", 955822338);
        setIntField(term168621, term168621.getClass(), "lastPlayMusicLevel", -1756659503);
        setIntField(term168621, term168621.getClass(), "lastEmoneyBrand", 1965003991);
        setField(term168619, term168619.getClass(), "user", term168621);
        setIntField(term168619, term168619.getClass(), "characterId", -1725442005);
        setIntField(term168619, term168619.getClass(), "costumeId", 2026681061);
        setIntField(term168619, term168619.getClass(), "attachmentId", -1893031586);
        setIntField(term168619, term168619.getClass(), "playCount", -1605006859);
        setIntField(term168619, term168619.getClass(), "intimateLevel", -555520867);
        setIntField(term168619, term168619.getClass(), "intimateCount", -55584715);
        setIntField(term168619, term168619.getClass(), "intimateCountRewarded", -1140026535);
        setField(term168619, term168619.getClass(), "intimateCountDate", "LvPdtNhyPi");
        setBooleanField(term168619, term168619.getClass(), "isNew", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term168619, args);
    }

};


