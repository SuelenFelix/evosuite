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

public class UserChapter_hashCode_211455714025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94484;

    public UserChapter_hashCode_211455714025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term94490 = new Long(5330761990446327930L);
        term94484 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term94486 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term94488 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term94504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94509 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94514 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94515 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94519 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94484, term94484.getClass(), "id", -4983594185740540113L);
        setLongField(term94486, term94486.getClass(), "id", 8586289140012236557L);
        setLongField(term94488, term94488.getClass(), "id", -2520869334873318760L);
        setField(term94488, term94488.getClass(), "extId", term94490);
        setField(term94488, term94488.getClass(), "luid", "igjhLhfUDg");
        setIntField(term94505, term94505.getClass(), "year", 2028);
        setShortField(term94505, term94505.getClass(), "month", (short) 4);
        setShortField(term94505, term94505.getClass(), "day", (short) 19);
        setField(term94504, term94504.getClass(), "date", term94505);
        setByteField(term94509, term94509.getClass(), "hour", (byte) 1);
        setByteField(term94509, term94509.getClass(), "minute", (byte) 47);
        setByteField(term94509, term94509.getClass(), "second", (byte) 52);
        setIntField(term94509, term94509.getClass(), "nano", 666536453);
        setField(term94504, term94504.getClass(), "time", term94509);
        setField(term94488, term94488.getClass(), "registerTime", term94504);
        setIntField(term94515, term94515.getClass(), "year", 2023);
        setShortField(term94515, term94515.getClass(), "month", (short) 12);
        setShortField(term94515, term94515.getClass(), "day", (short) 8);
        setField(term94514, term94514.getClass(), "date", term94515);
        setByteField(term94519, term94519.getClass(), "hour", (byte) 1);
        setByteField(term94519, term94519.getClass(), "minute", (byte) 26);
        setByteField(term94519, term94519.getClass(), "second", (byte) 38);
        setIntField(term94519, term94519.getClass(), "nano", 334721598);
        setField(term94514, term94514.getClass(), "time", term94519);
        setField(term94488, term94488.getClass(), "accessTime", term94514);
        setField(term94486, term94486.getClass(), "card", term94488);
        setField(term94486, term94486.getClass(), "userName", "aphCSNJgJZ");
        setIntField(term94486, term94486.getClass(), "level", 2131854523);
        setIntField(term94486, term94486.getClass(), "reincarnationNum", -2074551841);
        setLongField(term94486, term94486.getClass(), "exp", 2750359164820242674L);
        setLongField(term94486, term94486.getClass(), "point", -2492854267771258053L);
        setLongField(term94486, term94486.getClass(), "totalPoint", -1924023283383473287L);
        setIntField(term94486, term94486.getClass(), "playCount", 1213549602);
        setIntField(term94486, term94486.getClass(), "jewelCount", -1638897284);
        setIntField(term94486, term94486.getClass(), "totalJewelCount", -1998048906);
        setIntField(term94486, term94486.getClass(), "medalCount", -1915332852);
        setIntField(term94486, term94486.getClass(), "playerRating", 1603272771);
        setIntField(term94486, term94486.getClass(), "highestRating", -1169796605);
        setIntField(term94486, term94486.getClass(), "battlePoint", 1294129760);
        setIntField(term94486, term94486.getClass(), "bestBattlePoint", -1042003821);
        setIntField(term94486, term94486.getClass(), "overDamageBattlePoint", 1800189572);
        setBooleanField(term94486, term94486.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term94486, term94486.getClass(), "nameplateId", -555300889);
        setIntField(term94486, term94486.getClass(), "trophyId", -319938895);
        setIntField(term94486, term94486.getClass(), "cardId", -529078248);
        setIntField(term94486, term94486.getClass(), "characterId", 2125754107);
        setIntField(term94486, term94486.getClass(), "characterVoiceNo", 1094413748);
        setIntField(term94486, term94486.getClass(), "tabSetting", 1697340530);
        setIntField(term94486, term94486.getClass(), "tabSortSetting", 2037702914);
        setIntField(term94486, term94486.getClass(), "cardCategorySetting", 540968254);
        setIntField(term94486, term94486.getClass(), "cardSortSetting", 1166539646);
        setIntField(term94486, term94486.getClass(), "rivalScoreCategorySetting", 1055557164);
        setIntField(term94486, term94486.getClass(), "playedTutorialBit", -1601763818);
        setIntField(term94486, term94486.getClass(), "firstTutorialCancelNum", 562192186);
        setLongField(term94486, term94486.getClass(), "sumTechHighScore", -1575737126982353837L);
        setLongField(term94486, term94486.getClass(), "sumTechBasicHighScore", 6494928659054318901L);
        setLongField(term94486, term94486.getClass(), "sumTechAdvancedHighScore", -3004736165532415279L);
        setLongField(term94486, term94486.getClass(), "sumTechExpertHighScore", -499589695916275164L);
        setLongField(term94486, term94486.getClass(), "sumTechMasterHighScore", -248717578970051492L);
        setLongField(term94486, term94486.getClass(), "sumTechLunaticHighScore", -3192952069616776104L);
        setLongField(term94486, term94486.getClass(), "sumBattleHighScore", 5174934145269975705L);
        setLongField(term94486, term94486.getClass(), "sumBattleBasicHighScore", 2429413598537988825L);
        setLongField(term94486, term94486.getClass(), "sumBattleAdvancedHighScore", -8994091859603599701L);
        setLongField(term94486, term94486.getClass(), "sumBattleExpertHighScore", 188856881917035209L);
        setLongField(term94486, term94486.getClass(), "sumBattleMasterHighScore", 8981860257922986237L);
        setLongField(term94486, term94486.getClass(), "sumBattleLunaticHighScore", 7147111790881898185L);
        setField(term94486, term94486.getClass(), "eventWatchedDate", "JtamsBczow");
        setField(term94486, term94486.getClass(), "cmEventWatchedDate", "ckScPlFqWx");
        setField(term94486, term94486.getClass(), "firstGameId", "KIGJgoclUB");
        setField(term94486, term94486.getClass(), "firstRomVersion", "LxnOVCDRzb");
        setField(term94486, term94486.getClass(), "firstDataVersion", "MPsfpSOhwQ");
        setField(term94486, term94486.getClass(), "firstPlayDate", "GkTxuqMoMw");
        setField(term94486, term94486.getClass(), "lastGameId", "MdlLUfrIYx");
        setField(term94486, term94486.getClass(), "lastRomVersion", "trNmqmTVhn");
        setField(term94486, term94486.getClass(), "lastDataVersion", "oRcEdheGqg");
        setField(term94486, term94486.getClass(), "compatibleCmVersion", "vwQAcJEANy");
        setField(term94486, term94486.getClass(), "lastPlayDate", "bakvKrXWXm");
        setIntField(term94486, term94486.getClass(), "lastPlaceId", -904648920);
        setField(term94486, term94486.getClass(), "lastPlaceName", "ixpDCFiQaP");
        setIntField(term94486, term94486.getClass(), "lastRegionId", -457236509);
        setField(term94486, term94486.getClass(), "lastRegionName", "vrRPhHcJDp");
        setIntField(term94486, term94486.getClass(), "lastAllNetId", 1719352674);
        setField(term94486, term94486.getClass(), "lastClientId", "GAfAmizshG");
        setIntField(term94486, term94486.getClass(), "lastUsedDeckId", 1551152450);
        setIntField(term94486, term94486.getClass(), "lastPlayMusicLevel", -1821029149);
        setIntField(term94486, term94486.getClass(), "lastEmoneyBrand", -1120692414);
        setField(term94484, term94484.getClass(), "user", term94486);
        setIntField(term94484, term94484.getClass(), "chapterId", 630179419);
        setIntField(term94484, term94484.getClass(), "jewelCount", -1314338966);
        setIntField(term94484, term94484.getClass(), "lastPlayMusicCategory", 632003573);
        setIntField(term94484, term94484.getClass(), "lastPlayMusicId", 253586199);
        setIntField(term94484, term94484.getClass(), "lastPlayMusicLevel", 1269448265);
        setBooleanField(term94484, term94484.getClass(), "isStoryWatched", true);
        setBooleanField(term94484, term94484.getClass(), "isClear", false);
        setIntField(term94484, term94484.getClass(), "skipTiming1", 1407128598);
        setIntField(term94484, term94484.getClass(), "skipTiming2", -799093829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term94484, args);
    }

};


