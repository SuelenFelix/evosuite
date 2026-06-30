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

public class UserScenario_toString_96431207112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101672;

    public UserScenario_toString_96431207112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term101678 = new Long(5904678961906211249L);
        term101672 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term101674 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term101676 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term101692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term101702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101707 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term101672, term101672.getClass(), "id", 3618166054030395880L);
        setLongField(term101674, term101674.getClass(), "id", 2748063209175916338L);
        setLongField(term101676, term101676.getClass(), "id", 3289259176692658905L);
        setField(term101676, term101676.getClass(), "extId", term101678);
        setField(term101676, term101676.getClass(), "luid", "ZNLWGsxniS");
        setIntField(term101693, term101693.getClass(), "year", 2014);
        setShortField(term101693, term101693.getClass(), "month", (short) 11);
        setShortField(term101693, term101693.getClass(), "day", (short) 17);
        setField(term101692, term101692.getClass(), "date", term101693);
        setByteField(term101697, term101697.getClass(), "hour", (byte) 16);
        setByteField(term101697, term101697.getClass(), "minute", (byte) 57);
        setByteField(term101697, term101697.getClass(), "second", (byte) 36);
        setIntField(term101697, term101697.getClass(), "nano", 336508243);
        setField(term101692, term101692.getClass(), "time", term101697);
        setField(term101676, term101676.getClass(), "registerTime", term101692);
        setIntField(term101703, term101703.getClass(), "year", 2020);
        setShortField(term101703, term101703.getClass(), "month", (short) 5);
        setShortField(term101703, term101703.getClass(), "day", (short) 21);
        setField(term101702, term101702.getClass(), "date", term101703);
        setByteField(term101707, term101707.getClass(), "hour", (byte) 1);
        setByteField(term101707, term101707.getClass(), "minute", (byte) 0);
        setByteField(term101707, term101707.getClass(), "second", (byte) 30);
        setIntField(term101707, term101707.getClass(), "nano", 495919259);
        setField(term101702, term101702.getClass(), "time", term101707);
        setField(term101676, term101676.getClass(), "accessTime", term101702);
        setField(term101674, term101674.getClass(), "card", term101676);
        setField(term101674, term101674.getClass(), "userName", "JARLxkvqNB");
        setIntField(term101674, term101674.getClass(), "level", -51331217);
        setIntField(term101674, term101674.getClass(), "reincarnationNum", -803545267);
        setLongField(term101674, term101674.getClass(), "exp", 8435578074607494266L);
        setLongField(term101674, term101674.getClass(), "point", 1158999985649712324L);
        setLongField(term101674, term101674.getClass(), "totalPoint", 1240831512723722148L);
        setIntField(term101674, term101674.getClass(), "playCount", -388367706);
        setIntField(term101674, term101674.getClass(), "jewelCount", 183138801);
        setIntField(term101674, term101674.getClass(), "totalJewelCount", 688821159);
        setIntField(term101674, term101674.getClass(), "medalCount", -150882692);
        setIntField(term101674, term101674.getClass(), "playerRating", -1519638017);
        setIntField(term101674, term101674.getClass(), "highestRating", 195629114);
        setIntField(term101674, term101674.getClass(), "battlePoint", -849598898);
        setIntField(term101674, term101674.getClass(), "bestBattlePoint", 1081526364);
        setIntField(term101674, term101674.getClass(), "overDamageBattlePoint", 1306371805);
        setBooleanField(term101674, term101674.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term101674, term101674.getClass(), "nameplateId", -1780897540);
        setIntField(term101674, term101674.getClass(), "trophyId", 1460754129);
        setIntField(term101674, term101674.getClass(), "cardId", 1529697463);
        setIntField(term101674, term101674.getClass(), "characterId", 26790762);
        setIntField(term101674, term101674.getClass(), "characterVoiceNo", 1788263953);
        setIntField(term101674, term101674.getClass(), "tabSetting", -1672203019);
        setIntField(term101674, term101674.getClass(), "tabSortSetting", -1184413887);
        setIntField(term101674, term101674.getClass(), "cardCategorySetting", -831173295);
        setIntField(term101674, term101674.getClass(), "cardSortSetting", 1563333150);
        setIntField(term101674, term101674.getClass(), "rivalScoreCategorySetting", -766475202);
        setIntField(term101674, term101674.getClass(), "playedTutorialBit", 1362362674);
        setIntField(term101674, term101674.getClass(), "firstTutorialCancelNum", 553585097);
        setLongField(term101674, term101674.getClass(), "sumTechHighScore", -5427519956812562732L);
        setLongField(term101674, term101674.getClass(), "sumTechBasicHighScore", 6139192874538815024L);
        setLongField(term101674, term101674.getClass(), "sumTechAdvancedHighScore", 2328251836921519486L);
        setLongField(term101674, term101674.getClass(), "sumTechExpertHighScore", 5343471362225022865L);
        setLongField(term101674, term101674.getClass(), "sumTechMasterHighScore", 5497156593559186662L);
        setLongField(term101674, term101674.getClass(), "sumTechLunaticHighScore", 6687061627800420404L);
        setLongField(term101674, term101674.getClass(), "sumBattleHighScore", 4389517814029817218L);
        setLongField(term101674, term101674.getClass(), "sumBattleBasicHighScore", 4390960699657111744L);
        setLongField(term101674, term101674.getClass(), "sumBattleAdvancedHighScore", -4293598789426929923L);
        setLongField(term101674, term101674.getClass(), "sumBattleExpertHighScore", 8372414958364597663L);
        setLongField(term101674, term101674.getClass(), "sumBattleMasterHighScore", -984845489769970339L);
        setLongField(term101674, term101674.getClass(), "sumBattleLunaticHighScore", 1509515931025726141L);
        setField(term101674, term101674.getClass(), "eventWatchedDate", "tNcVErsFVe");
        setField(term101674, term101674.getClass(), "cmEventWatchedDate", "DnCwTIIzcH");
        setField(term101674, term101674.getClass(), "firstGameId", "ULOSEQkLaZ");
        setField(term101674, term101674.getClass(), "firstRomVersion", "frsRnTwGAg");
        setField(term101674, term101674.getClass(), "firstDataVersion", "mLdICgTzLU");
        setField(term101674, term101674.getClass(), "firstPlayDate", "MgDkHuQnRs");
        setField(term101674, term101674.getClass(), "lastGameId", "iEeRhESASl");
        setField(term101674, term101674.getClass(), "lastRomVersion", "eywpqasaKj");
        setField(term101674, term101674.getClass(), "lastDataVersion", "QnaLMKXAzJ");
        setField(term101674, term101674.getClass(), "compatibleCmVersion", "QrHmFoeUoY");
        setField(term101674, term101674.getClass(), "lastPlayDate", "BIysFVoAAl");
        setIntField(term101674, term101674.getClass(), "lastPlaceId", 1212393039);
        setField(term101674, term101674.getClass(), "lastPlaceName", "TAqcGSOgIz");
        setIntField(term101674, term101674.getClass(), "lastRegionId", -1346793067);
        setField(term101674, term101674.getClass(), "lastRegionName", "hqyMxHWbGv");
        setIntField(term101674, term101674.getClass(), "lastAllNetId", 517580821);
        setField(term101674, term101674.getClass(), "lastClientId", "ucSkoerFDq");
        setIntField(term101674, term101674.getClass(), "lastUsedDeckId", 1804537299);
        setIntField(term101674, term101674.getClass(), "lastPlayMusicLevel", 1200772934);
        setIntField(term101674, term101674.getClass(), "lastEmoneyBrand", -639549660);
        setField(term101672, term101672.getClass(), "user", term101674);
        setIntField(term101672, term101672.getClass(), "scenarioId", -92008992);
        setIntField(term101672, term101672.getClass(), "playCount", -1867096385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term101672, args);
    }

};


