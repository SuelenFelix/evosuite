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

public class UserCharacter_hashCode_59954476025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179549;

    public UserCharacter_hashCode_59954476025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term179555 = new Long(6895382576300001141L);
        term179549 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term179551 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term179553 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term179569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179574 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179584 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term179549, term179549.getClass(), "id", -8223468232855038726L);
        setLongField(term179551, term179551.getClass(), "id", 4918693338600446333L);
        setLongField(term179553, term179553.getClass(), "id", 1379952003868337325L);
        setField(term179553, term179553.getClass(), "extId", term179555);
        setField(term179553, term179553.getClass(), "luid", "cLFbviuWen");
        setIntField(term179570, term179570.getClass(), "year", 2014);
        setShortField(term179570, term179570.getClass(), "month", (short) 9);
        setShortField(term179570, term179570.getClass(), "day", (short) 26);
        setField(term179569, term179569.getClass(), "date", term179570);
        setByteField(term179574, term179574.getClass(), "hour", (byte) 5);
        setByteField(term179574, term179574.getClass(), "minute", (byte) 40);
        setByteField(term179574, term179574.getClass(), "second", (byte) 6);
        setIntField(term179574, term179574.getClass(), "nano", 923937756);
        setField(term179569, term179569.getClass(), "time", term179574);
        setField(term179553, term179553.getClass(), "registerTime", term179569);
        setIntField(term179580, term179580.getClass(), "year", 2023);
        setShortField(term179580, term179580.getClass(), "month", (short) 8);
        setShortField(term179580, term179580.getClass(), "day", (short) 18);
        setField(term179579, term179579.getClass(), "date", term179580);
        setByteField(term179584, term179584.getClass(), "hour", (byte) 14);
        setByteField(term179584, term179584.getClass(), "minute", (byte) 2);
        setByteField(term179584, term179584.getClass(), "second", (byte) 54);
        setIntField(term179584, term179584.getClass(), "nano", 97633516);
        setField(term179579, term179579.getClass(), "time", term179584);
        setField(term179553, term179553.getClass(), "accessTime", term179579);
        setField(term179551, term179551.getClass(), "card", term179553);
        setField(term179551, term179551.getClass(), "userName", "rKrakRVVmh");
        setIntField(term179551, term179551.getClass(), "level", -126124540);
        setIntField(term179551, term179551.getClass(), "reincarnationNum", -798322865);
        setLongField(term179551, term179551.getClass(), "exp", -7308035967659707286L);
        setLongField(term179551, term179551.getClass(), "point", -3079188602701979724L);
        setLongField(term179551, term179551.getClass(), "totalPoint", 4594249833913677901L);
        setIntField(term179551, term179551.getClass(), "playCount", -400148013);
        setIntField(term179551, term179551.getClass(), "jewelCount", -794879248);
        setIntField(term179551, term179551.getClass(), "totalJewelCount", -757299372);
        setIntField(term179551, term179551.getClass(), "medalCount", -914326611);
        setIntField(term179551, term179551.getClass(), "playerRating", 18577398);
        setIntField(term179551, term179551.getClass(), "highestRating", -355052439);
        setIntField(term179551, term179551.getClass(), "battlePoint", 334949165);
        setIntField(term179551, term179551.getClass(), "bestBattlePoint", 106163860);
        setIntField(term179551, term179551.getClass(), "overDamageBattlePoint", 656343283);
        setBooleanField(term179551, term179551.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term179551, term179551.getClass(), "nameplateId", 706546358);
        setIntField(term179551, term179551.getClass(), "trophyId", 1548818125);
        setIntField(term179551, term179551.getClass(), "cardId", 1232113626);
        setIntField(term179551, term179551.getClass(), "characterId", 2074975666);
        setIntField(term179551, term179551.getClass(), "characterVoiceNo", 1785785400);
        setIntField(term179551, term179551.getClass(), "tabSetting", 1103364487);
        setIntField(term179551, term179551.getClass(), "tabSortSetting", 1306932888);
        setIntField(term179551, term179551.getClass(), "cardCategorySetting", -1805947114);
        setIntField(term179551, term179551.getClass(), "cardSortSetting", 181911352);
        setIntField(term179551, term179551.getClass(), "rivalScoreCategorySetting", 1019450273);
        setIntField(term179551, term179551.getClass(), "playedTutorialBit", 1841139779);
        setIntField(term179551, term179551.getClass(), "firstTutorialCancelNum", -2029319805);
        setLongField(term179551, term179551.getClass(), "sumTechHighScore", -8011749040065963433L);
        setLongField(term179551, term179551.getClass(), "sumTechBasicHighScore", 6646239697396383164L);
        setLongField(term179551, term179551.getClass(), "sumTechAdvancedHighScore", -6302123431012645974L);
        setLongField(term179551, term179551.getClass(), "sumTechExpertHighScore", -6774894129275295131L);
        setLongField(term179551, term179551.getClass(), "sumTechMasterHighScore", 538680737345231926L);
        setLongField(term179551, term179551.getClass(), "sumTechLunaticHighScore", -3323235787265392046L);
        setLongField(term179551, term179551.getClass(), "sumBattleHighScore", 5706605646908256985L);
        setLongField(term179551, term179551.getClass(), "sumBattleBasicHighScore", -6862551204960712340L);
        setLongField(term179551, term179551.getClass(), "sumBattleAdvancedHighScore", -2611768320733508630L);
        setLongField(term179551, term179551.getClass(), "sumBattleExpertHighScore", 3956396540423829829L);
        setLongField(term179551, term179551.getClass(), "sumBattleMasterHighScore", 4225737646256871072L);
        setLongField(term179551, term179551.getClass(), "sumBattleLunaticHighScore", -4793231192343195887L);
        setField(term179551, term179551.getClass(), "eventWatchedDate", "aUMRfSqoGb");
        setField(term179551, term179551.getClass(), "cmEventWatchedDate", "VSThdiTljf");
        setField(term179551, term179551.getClass(), "firstGameId", "ZaRASloEFw");
        setField(term179551, term179551.getClass(), "firstRomVersion", "oGYdkSuAyc");
        setField(term179551, term179551.getClass(), "firstDataVersion", "exGygfXarC");
        setField(term179551, term179551.getClass(), "firstPlayDate", "uScAgvbMiS");
        setField(term179551, term179551.getClass(), "lastGameId", "FHcxNfrPHq");
        setField(term179551, term179551.getClass(), "lastRomVersion", "cjtsTbsYoC");
        setField(term179551, term179551.getClass(), "lastDataVersion", "VtSabsmozV");
        setField(term179551, term179551.getClass(), "compatibleCmVersion", "bCGOIIJoRc");
        setField(term179551, term179551.getClass(), "lastPlayDate", "JBMXhNQkrm");
        setIntField(term179551, term179551.getClass(), "lastPlaceId", 2034151707);
        setField(term179551, term179551.getClass(), "lastPlaceName", "hXpOAUqHsH");
        setIntField(term179551, term179551.getClass(), "lastRegionId", -208922753);
        setField(term179551, term179551.getClass(), "lastRegionName", "ERSAPkBZAi");
        setIntField(term179551, term179551.getClass(), "lastAllNetId", -47733507);
        setField(term179551, term179551.getClass(), "lastClientId", "nvdNdGuqeJ");
        setIntField(term179551, term179551.getClass(), "lastUsedDeckId", 1132217508);
        setIntField(term179551, term179551.getClass(), "lastPlayMusicLevel", 597877971);
        setIntField(term179551, term179551.getClass(), "lastEmoneyBrand", 1129519360);
        setField(term179549, term179549.getClass(), "user", term179551);
        setIntField(term179549, term179549.getClass(), "characterId", -986657496);
        setIntField(term179549, term179549.getClass(), "costumeId", 1452393321);
        setIntField(term179549, term179549.getClass(), "attachmentId", -259001191);
        setIntField(term179549, term179549.getClass(), "playCount", -526624985);
        setIntField(term179549, term179549.getClass(), "intimateLevel", -1808470980);
        setIntField(term179549, term179549.getClass(), "intimateCount", -333940657);
        setIntField(term179549, term179549.getClass(), "intimateCountRewarded", 681073368);
        setField(term179549, term179549.getClass(), "intimateCountDate", "EZAdJVjXks");
        setBooleanField(term179549, term179549.getClass(), "isNew", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term179549, args);
    }

};


