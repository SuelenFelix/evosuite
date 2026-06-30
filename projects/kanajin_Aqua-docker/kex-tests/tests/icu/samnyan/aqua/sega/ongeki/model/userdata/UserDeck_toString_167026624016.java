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

public class UserDeck_toString_167026624016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149291;

    public UserDeck_toString_167026624016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term149297 = new Long(-532956263280568707L);
        term149291 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term149293 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term149295 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term149311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149316 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149321 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149322 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149326 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term149291, term149291.getClass(), "id", 8854802809051917112L);
        setLongField(term149293, term149293.getClass(), "id", -8911668527319301730L);
        setLongField(term149295, term149295.getClass(), "id", -7431733508326413259L);
        setField(term149295, term149295.getClass(), "extId", term149297);
        setField(term149295, term149295.getClass(), "luid", "wJwrAJjLHN");
        setIntField(term149312, term149312.getClass(), "year", 2011);
        setShortField(term149312, term149312.getClass(), "month", (short) 10);
        setShortField(term149312, term149312.getClass(), "day", (short) 1);
        setField(term149311, term149311.getClass(), "date", term149312);
        setByteField(term149316, term149316.getClass(), "hour", (byte) 18);
        setByteField(term149316, term149316.getClass(), "minute", (byte) 14);
        setByteField(term149316, term149316.getClass(), "second", (byte) 45);
        setIntField(term149316, term149316.getClass(), "nano", 803299439);
        setField(term149311, term149311.getClass(), "time", term149316);
        setField(term149295, term149295.getClass(), "registerTime", term149311);
        setIntField(term149322, term149322.getClass(), "year", 2012);
        setShortField(term149322, term149322.getClass(), "month", (short) 9);
        setShortField(term149322, term149322.getClass(), "day", (short) 19);
        setField(term149321, term149321.getClass(), "date", term149322);
        setByteField(term149326, term149326.getClass(), "hour", (byte) 7);
        setByteField(term149326, term149326.getClass(), "minute", (byte) 16);
        setByteField(term149326, term149326.getClass(), "second", (byte) 32);
        setIntField(term149326, term149326.getClass(), "nano", 771452025);
        setField(term149321, term149321.getClass(), "time", term149326);
        setField(term149295, term149295.getClass(), "accessTime", term149321);
        setField(term149293, term149293.getClass(), "card", term149295);
        setField(term149293, term149293.getClass(), "userName", "gSRycxEfPs");
        setIntField(term149293, term149293.getClass(), "level", 1303949911);
        setIntField(term149293, term149293.getClass(), "reincarnationNum", 981415365);
        setLongField(term149293, term149293.getClass(), "exp", -8146324033391564783L);
        setLongField(term149293, term149293.getClass(), "point", -3715596416462720334L);
        setLongField(term149293, term149293.getClass(), "totalPoint", 9209938373712457228L);
        setIntField(term149293, term149293.getClass(), "playCount", 578948651);
        setIntField(term149293, term149293.getClass(), "jewelCount", -159365198);
        setIntField(term149293, term149293.getClass(), "totalJewelCount", 403862627);
        setIntField(term149293, term149293.getClass(), "medalCount", -1058988340);
        setIntField(term149293, term149293.getClass(), "playerRating", 10811623);
        setIntField(term149293, term149293.getClass(), "highestRating", 188015737);
        setIntField(term149293, term149293.getClass(), "battlePoint", 1054374404);
        setIntField(term149293, term149293.getClass(), "bestBattlePoint", -666072892);
        setIntField(term149293, term149293.getClass(), "overDamageBattlePoint", -626435102);
        setBooleanField(term149293, term149293.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term149293, term149293.getClass(), "nameplateId", 734226321);
        setIntField(term149293, term149293.getClass(), "trophyId", -818023324);
        setIntField(term149293, term149293.getClass(), "cardId", 540998196);
        setIntField(term149293, term149293.getClass(), "characterId", -1360947775);
        setIntField(term149293, term149293.getClass(), "characterVoiceNo", -688211428);
        setIntField(term149293, term149293.getClass(), "tabSetting", 976339797);
        setIntField(term149293, term149293.getClass(), "tabSortSetting", -606155396);
        setIntField(term149293, term149293.getClass(), "cardCategorySetting", 1734679414);
        setIntField(term149293, term149293.getClass(), "cardSortSetting", -1815657201);
        setIntField(term149293, term149293.getClass(), "rivalScoreCategorySetting", -888163744);
        setIntField(term149293, term149293.getClass(), "playedTutorialBit", 1589783137);
        setIntField(term149293, term149293.getClass(), "firstTutorialCancelNum", 1822772585);
        setLongField(term149293, term149293.getClass(), "sumTechHighScore", -5348574696983574339L);
        setLongField(term149293, term149293.getClass(), "sumTechBasicHighScore", -1284146091289381619L);
        setLongField(term149293, term149293.getClass(), "sumTechAdvancedHighScore", 4264667760528301486L);
        setLongField(term149293, term149293.getClass(), "sumTechExpertHighScore", 7746559570508965209L);
        setLongField(term149293, term149293.getClass(), "sumTechMasterHighScore", -1264224872671861072L);
        setLongField(term149293, term149293.getClass(), "sumTechLunaticHighScore", -6357554034121053154L);
        setLongField(term149293, term149293.getClass(), "sumBattleHighScore", -6188549100185582720L);
        setLongField(term149293, term149293.getClass(), "sumBattleBasicHighScore", -7292915458192508965L);
        setLongField(term149293, term149293.getClass(), "sumBattleAdvancedHighScore", 846082552977812341L);
        setLongField(term149293, term149293.getClass(), "sumBattleExpertHighScore", 4402021607554225919L);
        setLongField(term149293, term149293.getClass(), "sumBattleMasterHighScore", -6308894711514945857L);
        setLongField(term149293, term149293.getClass(), "sumBattleLunaticHighScore", -8534375521940153136L);
        setField(term149293, term149293.getClass(), "eventWatchedDate", "GbkbXMhBtB");
        setField(term149293, term149293.getClass(), "cmEventWatchedDate", "STgtLenzXP");
        setField(term149293, term149293.getClass(), "firstGameId", "pnHopfEgPj");
        setField(term149293, term149293.getClass(), "firstRomVersion", "iJGTSezGOP");
        setField(term149293, term149293.getClass(), "firstDataVersion", "cYJhSeWnSi");
        setField(term149293, term149293.getClass(), "firstPlayDate", "qzKzPGJuGS");
        setField(term149293, term149293.getClass(), "lastGameId", "sqSrNLvGGR");
        setField(term149293, term149293.getClass(), "lastRomVersion", "qTeNEZoQMq");
        setField(term149293, term149293.getClass(), "lastDataVersion", "lsfFhJHsOw");
        setField(term149293, term149293.getClass(), "compatibleCmVersion", "ItRdcNlydv");
        setField(term149293, term149293.getClass(), "lastPlayDate", "SUQszaJTZI");
        setIntField(term149293, term149293.getClass(), "lastPlaceId", -1240567719);
        setField(term149293, term149293.getClass(), "lastPlaceName", "ecUXveHGcV");
        setIntField(term149293, term149293.getClass(), "lastRegionId", 444592925);
        setField(term149293, term149293.getClass(), "lastRegionName", "jSBkabnQzS");
        setIntField(term149293, term149293.getClass(), "lastAllNetId", 1533907913);
        setField(term149293, term149293.getClass(), "lastClientId", "bOiHZqOEzP");
        setIntField(term149293, term149293.getClass(), "lastUsedDeckId", 1834871797);
        setIntField(term149293, term149293.getClass(), "lastPlayMusicLevel", 2074112074);
        setIntField(term149293, term149293.getClass(), "lastEmoneyBrand", -1339856700);
        setField(term149291, term149291.getClass(), "user", term149293);
        setIntField(term149291, term149291.getClass(), "deckId", -1979249214);
        setIntField(term149291, term149291.getClass(), "cardId1", -793518315);
        setIntField(term149291, term149291.getClass(), "cardId2", 2091844914);
        setIntField(term149291, term149291.getClass(), "cardId3", 2021693700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term149291, args);
    }

};


