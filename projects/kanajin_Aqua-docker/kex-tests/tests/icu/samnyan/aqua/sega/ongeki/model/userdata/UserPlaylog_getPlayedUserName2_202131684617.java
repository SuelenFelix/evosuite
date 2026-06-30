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

public class UserPlaylog_getPlayedUserName2_202131684617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191962;

    public UserPlaylog_getPlayedUserName2_202131684617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term191968 = new Long(-4058686252500969842L);
        term191962 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term191964 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term191966 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term191982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term191983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term191987 = newInstance(Class.forName("java.time.LocalTime"));
        Object term191992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term191993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term191997 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term191962, term191962.getClass(), "id", -2731641472967348371L);
        setLongField(term191964, term191964.getClass(), "id", -2649346725715360483L);
        setLongField(term191966, term191966.getClass(), "id", 5116248057543182857L);
        setField(term191966, term191966.getClass(), "extId", term191968);
        setField(term191966, term191966.getClass(), "luid", "bwwObTfhHs");
        setIntField(term191983, term191983.getClass(), "year", 2020);
        setShortField(term191983, term191983.getClass(), "month", (short) 10);
        setShortField(term191983, term191983.getClass(), "day", (short) 22);
        setField(term191982, term191982.getClass(), "date", term191983);
        setByteField(term191987, term191987.getClass(), "hour", (byte) 22);
        setByteField(term191987, term191987.getClass(), "minute", (byte) 10);
        setByteField(term191987, term191987.getClass(), "second", (byte) 45);
        setIntField(term191987, term191987.getClass(), "nano", 397845140);
        setField(term191982, term191982.getClass(), "time", term191987);
        setField(term191966, term191966.getClass(), "registerTime", term191982);
        setIntField(term191993, term191993.getClass(), "year", 2023);
        setShortField(term191993, term191993.getClass(), "month", (short) 3);
        setShortField(term191993, term191993.getClass(), "day", (short) 11);
        setField(term191992, term191992.getClass(), "date", term191993);
        setByteField(term191997, term191997.getClass(), "hour", (byte) 2);
        setByteField(term191997, term191997.getClass(), "minute", (byte) 18);
        setByteField(term191997, term191997.getClass(), "second", (byte) 39);
        setIntField(term191997, term191997.getClass(), "nano", 701112042);
        setField(term191992, term191992.getClass(), "time", term191997);
        setField(term191966, term191966.getClass(), "accessTime", term191992);
        setField(term191964, term191964.getClass(), "card", term191966);
        setField(term191964, term191964.getClass(), "userName", "JOxxUMDzMi");
        setIntField(term191964, term191964.getClass(), "level", -821064726);
        setIntField(term191964, term191964.getClass(), "reincarnationNum", 921170353);
        setLongField(term191964, term191964.getClass(), "exp", -7370456374047763255L);
        setLongField(term191964, term191964.getClass(), "point", -4065810640319169457L);
        setLongField(term191964, term191964.getClass(), "totalPoint", 995699203956083797L);
        setIntField(term191964, term191964.getClass(), "playCount", 244054341);
        setIntField(term191964, term191964.getClass(), "jewelCount", 983881216);
        setIntField(term191964, term191964.getClass(), "totalJewelCount", 388159136);
        setIntField(term191964, term191964.getClass(), "medalCount", -1116011104);
        setIntField(term191964, term191964.getClass(), "playerRating", 1309658897);
        setIntField(term191964, term191964.getClass(), "highestRating", -342067208);
        setIntField(term191964, term191964.getClass(), "battlePoint", 389436595);
        setIntField(term191964, term191964.getClass(), "bestBattlePoint", 614489290);
        setIntField(term191964, term191964.getClass(), "overDamageBattlePoint", 496383477);
        setBooleanField(term191964, term191964.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term191964, term191964.getClass(), "nameplateId", -928184942);
        setIntField(term191964, term191964.getClass(), "trophyId", 1982715971);
        setIntField(term191964, term191964.getClass(), "cardId", 475160369);
        setIntField(term191964, term191964.getClass(), "characterId", -626323068);
        setIntField(term191964, term191964.getClass(), "characterVoiceNo", -1588421324);
        setIntField(term191964, term191964.getClass(), "tabSetting", -1720779783);
        setIntField(term191964, term191964.getClass(), "tabSortSetting", 250416432);
        setIntField(term191964, term191964.getClass(), "cardCategorySetting", -2134709115);
        setIntField(term191964, term191964.getClass(), "cardSortSetting", 989626374);
        setIntField(term191964, term191964.getClass(), "rivalScoreCategorySetting", 837548396);
        setIntField(term191964, term191964.getClass(), "playedTutorialBit", 1201217557);
        setIntField(term191964, term191964.getClass(), "firstTutorialCancelNum", -1534275590);
        setLongField(term191964, term191964.getClass(), "sumTechHighScore", -4460367475200173823L);
        setLongField(term191964, term191964.getClass(), "sumTechBasicHighScore", 5899207062544713626L);
        setLongField(term191964, term191964.getClass(), "sumTechAdvancedHighScore", 2944697398766065795L);
        setLongField(term191964, term191964.getClass(), "sumTechExpertHighScore", 8820651670792928989L);
        setLongField(term191964, term191964.getClass(), "sumTechMasterHighScore", -2230923720710312838L);
        setLongField(term191964, term191964.getClass(), "sumTechLunaticHighScore", 8846363547841887499L);
        setLongField(term191964, term191964.getClass(), "sumBattleHighScore", -2382291585354651217L);
        setLongField(term191964, term191964.getClass(), "sumBattleBasicHighScore", 3020454374230144582L);
        setLongField(term191964, term191964.getClass(), "sumBattleAdvancedHighScore", 6435239117290925113L);
        setLongField(term191964, term191964.getClass(), "sumBattleExpertHighScore", -1470980835830824288L);
        setLongField(term191964, term191964.getClass(), "sumBattleMasterHighScore", 6417094644459526619L);
        setLongField(term191964, term191964.getClass(), "sumBattleLunaticHighScore", -5730039719833517787L);
        setField(term191964, term191964.getClass(), "eventWatchedDate", "yZZmcbVGZy");
        setField(term191964, term191964.getClass(), "cmEventWatchedDate", "LKmbPgjjcM");
        setField(term191964, term191964.getClass(), "firstGameId", "UFtMnIwpQB");
        setField(term191964, term191964.getClass(), "firstRomVersion", "mBttQwNLGV");
        setField(term191964, term191964.getClass(), "firstDataVersion", "NQOlrMMoLe");
        setField(term191964, term191964.getClass(), "firstPlayDate", "CBbinlqqUA");
        setField(term191964, term191964.getClass(), "lastGameId", "dHbuyJcJjB");
        setField(term191964, term191964.getClass(), "lastRomVersion", "TIbgFtoEex");
        setField(term191964, term191964.getClass(), "lastDataVersion", "agvoIJPMlI");
        setField(term191964, term191964.getClass(), "compatibleCmVersion", "SKgoTYVFbm");
        setField(term191964, term191964.getClass(), "lastPlayDate", "YjsottiyXZ");
        setIntField(term191964, term191964.getClass(), "lastPlaceId", -1983695200);
        setField(term191964, term191964.getClass(), "lastPlaceName", "anZowJfgfR");
        setIntField(term191964, term191964.getClass(), "lastRegionId", -191168059);
        setField(term191964, term191964.getClass(), "lastRegionName", "ZmIbrizkha");
        setIntField(term191964, term191964.getClass(), "lastAllNetId", -1510989838);
        setField(term191964, term191964.getClass(), "lastClientId", "YMqvSYdDqY");
        setIntField(term191964, term191964.getClass(), "lastUsedDeckId", 1406928477);
        setIntField(term191964, term191964.getClass(), "lastPlayMusicLevel", 118476036);
        setIntField(term191964, term191964.getClass(), "lastEmoneyBrand", -1669858139);
        setField(term191962, term191962.getClass(), "user", term191964);
        setIntField(term191962, term191962.getClass(), "sortNumber", -1133804876);
        setIntField(term191962, term191962.getClass(), "placeId", -548122836);
        setField(term191962, term191962.getClass(), "placeName", "PlPbUzhDYB");
        setField(term191962, term191962.getClass(), "playDate", "ctWXrepEGs");
        setField(term191962, term191962.getClass(), "userPlayDate", "fbKUErcwbU");
        setIntField(term191962, term191962.getClass(), "musicId", 1004952014);
        setIntField(term191962, term191962.getClass(), "level", 2108215621);
        setIntField(term191962, term191962.getClass(), "playKind", -1245829004);
        setIntField(term191962, term191962.getClass(), "eventId", 1554466472);
        setField(term191962, term191962.getClass(), "eventName", "CPweBQmYOE");
        setIntField(term191962, term191962.getClass(), "eventPoint", 16073898);
        setIntField(term191962, term191962.getClass(), "playedUserId1", 272276958);
        setIntField(term191962, term191962.getClass(), "playedUserId2", 794347789);
        setIntField(term191962, term191962.getClass(), "playedUserId3", 131728856);
        setField(term191962, term191962.getClass(), "playedUserName1", "EGsujTXNCu");
        setField(term191962, term191962.getClass(), "playedUserName2", "pfrtjBCFrk");
        setField(term191962, term191962.getClass(), "playedUserName3", "sFgyedFOUM");
        setIntField(term191962, term191962.getClass(), "playedMusicLevel1", 1924005893);
        setIntField(term191962, term191962.getClass(), "playedMusicLevel2", 1601208652);
        setIntField(term191962, term191962.getClass(), "playedMusicLevel3", -2108741906);
        setIntField(term191962, term191962.getClass(), "cardId1", -336183596);
        setIntField(term191962, term191962.getClass(), "cardId2", -356308474);
        setIntField(term191962, term191962.getClass(), "cardId3", -1895638291);
        setIntField(term191962, term191962.getClass(), "cardLevel1", -253945040);
        setIntField(term191962, term191962.getClass(), "cardLevel2", 1207589183);
        setIntField(term191962, term191962.getClass(), "cardLevel3", 1974683839);
        setIntField(term191962, term191962.getClass(), "cardAttack1", 607659215);
        setIntField(term191962, term191962.getClass(), "cardAttack2", 1797770986);
        setIntField(term191962, term191962.getClass(), "cardAttack3", -1609542892);
        setIntField(term191962, term191962.getClass(), "bossCharaId", -1580821089);
        setIntField(term191962, term191962.getClass(), "bossLevel", 1403964425);
        setIntField(term191962, term191962.getClass(), "bossAttribute", 986232260);
        setIntField(term191962, term191962.getClass(), "clearStatus", -45389402);
        setIntField(term191962, term191962.getClass(), "techScore", 1348045867);
        setIntField(term191962, term191962.getClass(), "techScoreRank", -1069438103);
        setIntField(term191962, term191962.getClass(), "battleScore", -680190518);
        setIntField(term191962, term191962.getClass(), "battleScoreRank", 1940442849);
        setIntField(term191962, term191962.getClass(), "platinumScore", 2041917421);
        setIntField(term191962, term191962.getClass(), "maxCombo", 1105661007);
        setIntField(term191962, term191962.getClass(), "judgeMiss", 2028890242);
        setIntField(term191962, term191962.getClass(), "judgeHit", 252702421);
        setIntField(term191962, term191962.getClass(), "judgeBreak", -497992276);
        setIntField(term191962, term191962.getClass(), "judgeCriticalBreak", -16494120);
        setIntField(term191962, term191962.getClass(), "rateTap", 143933759);
        setIntField(term191962, term191962.getClass(), "rateHold", -120387211);
        setIntField(term191962, term191962.getClass(), "rateFlick", 1433123804);
        setIntField(term191962, term191962.getClass(), "rateSideTap", 1303294526);
        setIntField(term191962, term191962.getClass(), "rateSideHold", -793549641);
        setIntField(term191962, term191962.getClass(), "bellCount", 939074715);
        setIntField(term191962, term191962.getClass(), "totalBellCount", -2019254696);
        setIntField(term191962, term191962.getClass(), "damageCount", 116630141);
        setIntField(term191962, term191962.getClass(), "overDamage", 1983958483);
        setBooleanField(term191962, term191962.getClass(), "isTechNewRecord", false);
        setBooleanField(term191962, term191962.getClass(), "isBattleNewRecord", false);
        setBooleanField(term191962, term191962.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term191962, term191962.getClass(), "isFullCombo", true);
        setBooleanField(term191962, term191962.getClass(), "isFullBell", false);
        setBooleanField(term191962, term191962.getClass(), "isAllBreak", false);
        setIntField(term191962, term191962.getClass(), "playerRating", 1537645134);
        setIntField(term191962, term191962.getClass(), "battlePoint", -1274842802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName2", argTypes, term191962, args);
    }

};


