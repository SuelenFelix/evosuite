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

public class UserDeck_setId_6261972187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144995;
     Object term145264;

    public UserDeck_setId_6261972187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term145001 = new Long(-5935517391653614345L);
        term144995 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term144997 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term144999 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term145015 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145016 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145020 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145025 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145026 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145030 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term144995, term144995.getClass(), "id", 2586113241920067879L);
        setLongField(term144997, term144997.getClass(), "id", -2808347115516032032L);
        setLongField(term144999, term144999.getClass(), "id", 1996561352542339787L);
        setField(term144999, term144999.getClass(), "extId", term145001);
        setField(term144999, term144999.getClass(), "luid", "bzgnEgNnJB");
        setIntField(term145016, term145016.getClass(), "year", 2017);
        setShortField(term145016, term145016.getClass(), "month", (short) 4);
        setShortField(term145016, term145016.getClass(), "day", (short) 16);
        setField(term145015, term145015.getClass(), "date", term145016);
        setByteField(term145020, term145020.getClass(), "hour", (byte) 8);
        setByteField(term145020, term145020.getClass(), "minute", (byte) 31);
        setByteField(term145020, term145020.getClass(), "second", (byte) 56);
        setIntField(term145020, term145020.getClass(), "nano", 663406344);
        setField(term145015, term145015.getClass(), "time", term145020);
        setField(term144999, term144999.getClass(), "registerTime", term145015);
        setIntField(term145026, term145026.getClass(), "year", 2010);
        setShortField(term145026, term145026.getClass(), "month", (short) 7);
        setShortField(term145026, term145026.getClass(), "day", (short) 8);
        setField(term145025, term145025.getClass(), "date", term145026);
        setByteField(term145030, term145030.getClass(), "hour", (byte) 3);
        setByteField(term145030, term145030.getClass(), "minute", (byte) 45);
        setByteField(term145030, term145030.getClass(), "second", (byte) 2);
        setIntField(term145030, term145030.getClass(), "nano", 15135741);
        setField(term145025, term145025.getClass(), "time", term145030);
        setField(term144999, term144999.getClass(), "accessTime", term145025);
        setField(term144997, term144997.getClass(), "card", term144999);
        setField(term144997, term144997.getClass(), "userName", "trgyZVXoXP");
        setIntField(term144997, term144997.getClass(), "level", -1596868093);
        setIntField(term144997, term144997.getClass(), "reincarnationNum", -1081975340);
        setLongField(term144997, term144997.getClass(), "exp", 5313788423265074644L);
        setLongField(term144997, term144997.getClass(), "point", -9018387622925608543L);
        setLongField(term144997, term144997.getClass(), "totalPoint", 2527498772903295508L);
        setIntField(term144997, term144997.getClass(), "playCount", 1804381424);
        setIntField(term144997, term144997.getClass(), "jewelCount", 347701928);
        setIntField(term144997, term144997.getClass(), "totalJewelCount", -1540852359);
        setIntField(term144997, term144997.getClass(), "medalCount", 351747692);
        setIntField(term144997, term144997.getClass(), "playerRating", 1960962844);
        setIntField(term144997, term144997.getClass(), "highestRating", 1500998512);
        setIntField(term144997, term144997.getClass(), "battlePoint", -961310688);
        setIntField(term144997, term144997.getClass(), "bestBattlePoint", -1837033783);
        setIntField(term144997, term144997.getClass(), "overDamageBattlePoint", -33928000);
        setBooleanField(term144997, term144997.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term144997, term144997.getClass(), "nameplateId", 1798598770);
        setIntField(term144997, term144997.getClass(), "trophyId", 1275192092);
        setIntField(term144997, term144997.getClass(), "cardId", 798975305);
        setIntField(term144997, term144997.getClass(), "characterId", -290202123);
        setIntField(term144997, term144997.getClass(), "characterVoiceNo", -858738604);
        setIntField(term144997, term144997.getClass(), "tabSetting", -1508450432);
        setIntField(term144997, term144997.getClass(), "tabSortSetting", -1168985350);
        setIntField(term144997, term144997.getClass(), "cardCategorySetting", 736504530);
        setIntField(term144997, term144997.getClass(), "cardSortSetting", -1151578095);
        setIntField(term144997, term144997.getClass(), "rivalScoreCategorySetting", -666674757);
        setIntField(term144997, term144997.getClass(), "playedTutorialBit", -618304525);
        setIntField(term144997, term144997.getClass(), "firstTutorialCancelNum", 1975532031);
        setLongField(term144997, term144997.getClass(), "sumTechHighScore", 1303842089000301409L);
        setLongField(term144997, term144997.getClass(), "sumTechBasicHighScore", -242113377903529144L);
        setLongField(term144997, term144997.getClass(), "sumTechAdvancedHighScore", 5776868848164448364L);
        setLongField(term144997, term144997.getClass(), "sumTechExpertHighScore", -5056372364193621003L);
        setLongField(term144997, term144997.getClass(), "sumTechMasterHighScore", 6955906067302543817L);
        setLongField(term144997, term144997.getClass(), "sumTechLunaticHighScore", 1132219021565369893L);
        setLongField(term144997, term144997.getClass(), "sumBattleHighScore", 7070122345328419689L);
        setLongField(term144997, term144997.getClass(), "sumBattleBasicHighScore", 417205365677861190L);
        setLongField(term144997, term144997.getClass(), "sumBattleAdvancedHighScore", -1500921373848385870L);
        setLongField(term144997, term144997.getClass(), "sumBattleExpertHighScore", -1214977177951012270L);
        setLongField(term144997, term144997.getClass(), "sumBattleMasterHighScore", 2675683074809174330L);
        setLongField(term144997, term144997.getClass(), "sumBattleLunaticHighScore", -8600275724412796368L);
        setField(term144997, term144997.getClass(), "eventWatchedDate", "zggGcOxpDe");
        setField(term144997, term144997.getClass(), "cmEventWatchedDate", "XdJngfMEyc");
        setField(term144997, term144997.getClass(), "firstGameId", "fBrxpovrjQ");
        setField(term144997, term144997.getClass(), "firstRomVersion", "vWNTKunytj");
        setField(term144997, term144997.getClass(), "firstDataVersion", "pbUCEQENML");
        setField(term144997, term144997.getClass(), "firstPlayDate", "iMEaCLgkkA");
        setField(term144997, term144997.getClass(), "lastGameId", "GTYlwBwnyr");
        setField(term144997, term144997.getClass(), "lastRomVersion", "EWesRocaYe");
        setField(term144997, term144997.getClass(), "lastDataVersion", "LXbvqrOwML");
        setField(term144997, term144997.getClass(), "compatibleCmVersion", "oJtyLMFIaY");
        setField(term144997, term144997.getClass(), "lastPlayDate", "OvGOlSMJSa");
        setIntField(term144997, term144997.getClass(), "lastPlaceId", -1548999687);
        setField(term144997, term144997.getClass(), "lastPlaceName", "bxfVqYYRGF");
        setIntField(term144997, term144997.getClass(), "lastRegionId", 1593514066);
        setField(term144997, term144997.getClass(), "lastRegionName", "wFXqDDYRYm");
        setIntField(term144997, term144997.getClass(), "lastAllNetId", 1329551874);
        setField(term144997, term144997.getClass(), "lastClientId", "kzyZeMslFg");
        setIntField(term144997, term144997.getClass(), "lastUsedDeckId", -378332024);
        setIntField(term144997, term144997.getClass(), "lastPlayMusicLevel", 77686011);
        setIntField(term144997, term144997.getClass(), "lastEmoneyBrand", 132651471);
        setField(term144995, term144995.getClass(), "user", term144997);
        setIntField(term144995, term144995.getClass(), "deckId", 1315153287);
        setIntField(term144995, term144995.getClass(), "cardId1", 760555251);
        setIntField(term144995, term144995.getClass(), "cardId2", -706677210);
        setIntField(term144995, term144995.getClass(), "cardId3", -468204040);
        term145264 = new Long(-7505147575192013869L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term145264;
        callMethod(klass, "setId", argTypes, term144995, args);
    }

};


