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

public class UserData_getCompatibleCmVersion_4313584951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43491;

    public UserData_getCompatibleCmVersion_4313584951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term43495 = new Long(-5216789073301458893L);
        term43491 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term43493 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term43509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43514 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43524 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term43491, term43491.getClass(), "id", -6079558432202737241L);
        setLongField(term43493, term43493.getClass(), "id", -3787130598270460761L);
        setField(term43493, term43493.getClass(), "extId", term43495);
        setField(term43493, term43493.getClass(), "luid", "XMArCaVAEc");
        setIntField(term43510, term43510.getClass(), "year", 2017);
        setShortField(term43510, term43510.getClass(), "month", (short) 8);
        setShortField(term43510, term43510.getClass(), "day", (short) 6);
        setField(term43509, term43509.getClass(), "date", term43510);
        setByteField(term43514, term43514.getClass(), "hour", (byte) 22);
        setByteField(term43514, term43514.getClass(), "minute", (byte) 46);
        setByteField(term43514, term43514.getClass(), "second", (byte) 47);
        setIntField(term43514, term43514.getClass(), "nano", 782967389);
        setField(term43509, term43509.getClass(), "time", term43514);
        setField(term43493, term43493.getClass(), "registerTime", term43509);
        setIntField(term43520, term43520.getClass(), "year", 2029);
        setShortField(term43520, term43520.getClass(), "month", (short) 3);
        setShortField(term43520, term43520.getClass(), "day", (short) 3);
        setField(term43519, term43519.getClass(), "date", term43520);
        setByteField(term43524, term43524.getClass(), "hour", (byte) 2);
        setByteField(term43524, term43524.getClass(), "minute", (byte) 29);
        setByteField(term43524, term43524.getClass(), "second", (byte) 54);
        setIntField(term43524, term43524.getClass(), "nano", 846675209);
        setField(term43519, term43519.getClass(), "time", term43524);
        setField(term43493, term43493.getClass(), "accessTime", term43519);
        setField(term43491, term43491.getClass(), "card", term43493);
        setField(term43491, term43491.getClass(), "userName", "URWnZtbrQH");
        setIntField(term43491, term43491.getClass(), "level", 1985711069);
        setIntField(term43491, term43491.getClass(), "reincarnationNum", -1497378582);
        setLongField(term43491, term43491.getClass(), "exp", 3458780357847556173L);
        setLongField(term43491, term43491.getClass(), "point", -252234842640503104L);
        setLongField(term43491, term43491.getClass(), "totalPoint", -4237738930912633869L);
        setIntField(term43491, term43491.getClass(), "playCount", -449740668);
        setIntField(term43491, term43491.getClass(), "jewelCount", 1283268105);
        setIntField(term43491, term43491.getClass(), "totalJewelCount", -220552939);
        setIntField(term43491, term43491.getClass(), "medalCount", -444257155);
        setIntField(term43491, term43491.getClass(), "playerRating", -309536114);
        setIntField(term43491, term43491.getClass(), "highestRating", 755500171);
        setIntField(term43491, term43491.getClass(), "battlePoint", -535062491);
        setIntField(term43491, term43491.getClass(), "bestBattlePoint", -147381920);
        setIntField(term43491, term43491.getClass(), "overDamageBattlePoint", -7568006);
        setBooleanField(term43491, term43491.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term43491, term43491.getClass(), "nameplateId", 1952367361);
        setIntField(term43491, term43491.getClass(), "trophyId", -715290594);
        setIntField(term43491, term43491.getClass(), "cardId", -860371306);
        setIntField(term43491, term43491.getClass(), "characterId", -125626789);
        setIntField(term43491, term43491.getClass(), "characterVoiceNo", -309827965);
        setIntField(term43491, term43491.getClass(), "tabSetting", -1534471014);
        setIntField(term43491, term43491.getClass(), "tabSortSetting", -468720148);
        setIntField(term43491, term43491.getClass(), "cardCategorySetting", 164755425);
        setIntField(term43491, term43491.getClass(), "cardSortSetting", 205469595);
        setIntField(term43491, term43491.getClass(), "rivalScoreCategorySetting", -638606539);
        setIntField(term43491, term43491.getClass(), "playedTutorialBit", -172607907);
        setIntField(term43491, term43491.getClass(), "firstTutorialCancelNum", 182656750);
        setLongField(term43491, term43491.getClass(), "sumTechHighScore", -3539678318307233375L);
        setLongField(term43491, term43491.getClass(), "sumTechBasicHighScore", -256569768909962991L);
        setLongField(term43491, term43491.getClass(), "sumTechAdvancedHighScore", -1765487752643688529L);
        setLongField(term43491, term43491.getClass(), "sumTechExpertHighScore", -322037057179477006L);
        setLongField(term43491, term43491.getClass(), "sumTechMasterHighScore", -856690647211976135L);
        setLongField(term43491, term43491.getClass(), "sumTechLunaticHighScore", 1872623849965712756L);
        setLongField(term43491, term43491.getClass(), "sumBattleHighScore", 4536273050817852892L);
        setLongField(term43491, term43491.getClass(), "sumBattleBasicHighScore", -8877453128191451125L);
        setLongField(term43491, term43491.getClass(), "sumBattleAdvancedHighScore", -7419533263156606680L);
        setLongField(term43491, term43491.getClass(), "sumBattleExpertHighScore", -6669304009215553269L);
        setLongField(term43491, term43491.getClass(), "sumBattleMasterHighScore", 8850925698448189827L);
        setLongField(term43491, term43491.getClass(), "sumBattleLunaticHighScore", -2444680017884853722L);
        setField(term43491, term43491.getClass(), "eventWatchedDate", "hpTAdtnQku");
        setField(term43491, term43491.getClass(), "cmEventWatchedDate", "GdMAXFBAtl");
        setField(term43491, term43491.getClass(), "firstGameId", "KWVRAlcIqd");
        setField(term43491, term43491.getClass(), "firstRomVersion", "GeVOqtDiGv");
        setField(term43491, term43491.getClass(), "firstDataVersion", "vbRAJCwftU");
        setField(term43491, term43491.getClass(), "firstPlayDate", "baJbjUImxp");
        setField(term43491, term43491.getClass(), "lastGameId", "lPERFqPpGz");
        setField(term43491, term43491.getClass(), "lastRomVersion", "jleFBTYSNb");
        setField(term43491, term43491.getClass(), "lastDataVersion", "WmSSWHEELj");
        setField(term43491, term43491.getClass(), "compatibleCmVersion", "ggFhMyQvdw");
        setField(term43491, term43491.getClass(), "lastPlayDate", "vZpMxQNHKu");
        setIntField(term43491, term43491.getClass(), "lastPlaceId", -51407538);
        setField(term43491, term43491.getClass(), "lastPlaceName", "QLMSDWYwBC");
        setIntField(term43491, term43491.getClass(), "lastRegionId", -465783748);
        setField(term43491, term43491.getClass(), "lastRegionName", "feyxNWUenU");
        setIntField(term43491, term43491.getClass(), "lastAllNetId", 1780832439);
        setField(term43491, term43491.getClass(), "lastClientId", "qvqwmSUIiP");
        setIntField(term43491, term43491.getClass(), "lastUsedDeckId", 1781593194);
        setIntField(term43491, term43491.getClass(), "lastPlayMusicLevel", -929366947);
        setIntField(term43491, term43491.getClass(), "lastEmoneyBrand", -10579292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCompatibleCmVersion", argTypes, term43491, args);
    }

};


