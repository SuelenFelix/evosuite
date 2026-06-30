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

public class UserChapter_setChapterId_365643714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89690;
     Object term89964;

    public UserChapter_setChapterId_365643714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term89696 = new Long(4394651392080968777L);
        term89690 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term89692 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term89694 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term89710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89715 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89725 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term89690, term89690.getClass(), "id", 1551275957786651375L);
        setLongField(term89692, term89692.getClass(), "id", -8133980169971902787L);
        setLongField(term89694, term89694.getClass(), "id", 5673377792803416715L);
        setField(term89694, term89694.getClass(), "extId", term89696);
        setField(term89694, term89694.getClass(), "luid", "CVrxrIRbBP");
        setIntField(term89711, term89711.getClass(), "year", 2013);
        setShortField(term89711, term89711.getClass(), "month", (short) 1);
        setShortField(term89711, term89711.getClass(), "day", (short) 1);
        setField(term89710, term89710.getClass(), "date", term89711);
        setByteField(term89715, term89715.getClass(), "hour", (byte) 17);
        setByteField(term89715, term89715.getClass(), "minute", (byte) 16);
        setByteField(term89715, term89715.getClass(), "second", (byte) 19);
        setIntField(term89715, term89715.getClass(), "nano", 656333309);
        setField(term89710, term89710.getClass(), "time", term89715);
        setField(term89694, term89694.getClass(), "registerTime", term89710);
        setIntField(term89721, term89721.getClass(), "year", 2012);
        setShortField(term89721, term89721.getClass(), "month", (short) 3);
        setShortField(term89721, term89721.getClass(), "day", (short) 8);
        setField(term89720, term89720.getClass(), "date", term89721);
        setByteField(term89725, term89725.getClass(), "hour", (byte) 18);
        setByteField(term89725, term89725.getClass(), "minute", (byte) 5);
        setByteField(term89725, term89725.getClass(), "second", (byte) 29);
        setIntField(term89725, term89725.getClass(), "nano", 800260160);
        setField(term89720, term89720.getClass(), "time", term89725);
        setField(term89694, term89694.getClass(), "accessTime", term89720);
        setField(term89692, term89692.getClass(), "card", term89694);
        setField(term89692, term89692.getClass(), "userName", "qMveUiByVL");
        setIntField(term89692, term89692.getClass(), "level", -1292573941);
        setIntField(term89692, term89692.getClass(), "reincarnationNum", 1960867757);
        setLongField(term89692, term89692.getClass(), "exp", -5845866725216038244L);
        setLongField(term89692, term89692.getClass(), "point", -477169378661100925L);
        setLongField(term89692, term89692.getClass(), "totalPoint", -3072190488587286945L);
        setIntField(term89692, term89692.getClass(), "playCount", -353830408);
        setIntField(term89692, term89692.getClass(), "jewelCount", 2082288063);
        setIntField(term89692, term89692.getClass(), "totalJewelCount", 535353751);
        setIntField(term89692, term89692.getClass(), "medalCount", -63865927);
        setIntField(term89692, term89692.getClass(), "playerRating", -2019481765);
        setIntField(term89692, term89692.getClass(), "highestRating", -425787036);
        setIntField(term89692, term89692.getClass(), "battlePoint", 1522770510);
        setIntField(term89692, term89692.getClass(), "bestBattlePoint", -1935030297);
        setIntField(term89692, term89692.getClass(), "overDamageBattlePoint", -1877013372);
        setBooleanField(term89692, term89692.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term89692, term89692.getClass(), "nameplateId", 1193388232);
        setIntField(term89692, term89692.getClass(), "trophyId", 1908942563);
        setIntField(term89692, term89692.getClass(), "cardId", 1566557753);
        setIntField(term89692, term89692.getClass(), "characterId", 1717239995);
        setIntField(term89692, term89692.getClass(), "characterVoiceNo", -2127412745);
        setIntField(term89692, term89692.getClass(), "tabSetting", -891519278);
        setIntField(term89692, term89692.getClass(), "tabSortSetting", 1794839887);
        setIntField(term89692, term89692.getClass(), "cardCategorySetting", 517802429);
        setIntField(term89692, term89692.getClass(), "cardSortSetting", 2029166588);
        setIntField(term89692, term89692.getClass(), "rivalScoreCategorySetting", -834807352);
        setIntField(term89692, term89692.getClass(), "playedTutorialBit", -1760219909);
        setIntField(term89692, term89692.getClass(), "firstTutorialCancelNum", -1053825347);
        setLongField(term89692, term89692.getClass(), "sumTechHighScore", 1314642074606264885L);
        setLongField(term89692, term89692.getClass(), "sumTechBasicHighScore", 2939609310992671627L);
        setLongField(term89692, term89692.getClass(), "sumTechAdvancedHighScore", 5979804142582983080L);
        setLongField(term89692, term89692.getClass(), "sumTechExpertHighScore", 411230505626862378L);
        setLongField(term89692, term89692.getClass(), "sumTechMasterHighScore", 7322238963049087952L);
        setLongField(term89692, term89692.getClass(), "sumTechLunaticHighScore", 7041318987404374954L);
        setLongField(term89692, term89692.getClass(), "sumBattleHighScore", -2429166277021159153L);
        setLongField(term89692, term89692.getClass(), "sumBattleBasicHighScore", -1488574802388008699L);
        setLongField(term89692, term89692.getClass(), "sumBattleAdvancedHighScore", -2210548996625197569L);
        setLongField(term89692, term89692.getClass(), "sumBattleExpertHighScore", 3355897565139344162L);
        setLongField(term89692, term89692.getClass(), "sumBattleMasterHighScore", 1710057988242023022L);
        setLongField(term89692, term89692.getClass(), "sumBattleLunaticHighScore", 8050970842743258746L);
        setField(term89692, term89692.getClass(), "eventWatchedDate", "VfhPQKCIrE");
        setField(term89692, term89692.getClass(), "cmEventWatchedDate", "RUgpUeqcGS");
        setField(term89692, term89692.getClass(), "firstGameId", "ufopOhWQkB");
        setField(term89692, term89692.getClass(), "firstRomVersion", "RqVPcaMpxk");
        setField(term89692, term89692.getClass(), "firstDataVersion", "zOsnJKDwhL");
        setField(term89692, term89692.getClass(), "firstPlayDate", "VCOuRNQveV");
        setField(term89692, term89692.getClass(), "lastGameId", "wOBUMePcSQ");
        setField(term89692, term89692.getClass(), "lastRomVersion", "SkfJvbcpSy");
        setField(term89692, term89692.getClass(), "lastDataVersion", "NQVfrHmuUQ");
        setField(term89692, term89692.getClass(), "compatibleCmVersion", "BxUEPMTBxW");
        setField(term89692, term89692.getClass(), "lastPlayDate", "OkwcYhqTPO");
        setIntField(term89692, term89692.getClass(), "lastPlaceId", 2141886355);
        setField(term89692, term89692.getClass(), "lastPlaceName", "XeHaPiTvPt");
        setIntField(term89692, term89692.getClass(), "lastRegionId", -979489727);
        setField(term89692, term89692.getClass(), "lastRegionName", "GsyGZIlHgo");
        setIntField(term89692, term89692.getClass(), "lastAllNetId", -1339607020);
        setField(term89692, term89692.getClass(), "lastClientId", "DPTUtDUuOf");
        setIntField(term89692, term89692.getClass(), "lastUsedDeckId", 21710763);
        setIntField(term89692, term89692.getClass(), "lastPlayMusicLevel", -1638359261);
        setIntField(term89692, term89692.getClass(), "lastEmoneyBrand", -1738702221);
        setField(term89690, term89690.getClass(), "user", term89692);
        setIntField(term89690, term89690.getClass(), "chapterId", 949696394);
        setIntField(term89690, term89690.getClass(), "jewelCount", 366195895);
        setIntField(term89690, term89690.getClass(), "lastPlayMusicCategory", 513276394);
        setIntField(term89690, term89690.getClass(), "lastPlayMusicId", -867492502);
        setIntField(term89690, term89690.getClass(), "lastPlayMusicLevel", 1315160763);
        setBooleanField(term89690, term89690.getClass(), "isStoryWatched", false);
        setBooleanField(term89690, term89690.getClass(), "isClear", true);
        setIntField(term89690, term89690.getClass(), "skipTiming1", -806163944);
        setIntField(term89690, term89690.getClass(), "skipTiming2", -1528700295);
        term89964 = new Integer(-92750221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term89964;
        callMethod(klass, "setChapterId", argTypes, term89690, args);
    }

};


