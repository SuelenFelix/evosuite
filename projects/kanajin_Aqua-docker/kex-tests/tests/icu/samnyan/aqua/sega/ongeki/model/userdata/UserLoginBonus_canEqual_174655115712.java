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

public class UserLoginBonus_canEqual_174655115712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306623;
     Object term306902;

    public UserLoginBonus_canEqual_174655115712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term306629 = new Long(-3692936312179064102L);
        term306623 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term306625 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term306627 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term306643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306648 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306658 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term306623, term306623.getClass(), "id", 2232150810305619677L);
        setLongField(term306625, term306625.getClass(), "id", 1763541456048019174L);
        setLongField(term306627, term306627.getClass(), "id", 6925557169233845166L);
        setField(term306627, term306627.getClass(), "extId", term306629);
        setField(term306627, term306627.getClass(), "luid", "mUquGBKYgP");
        setIntField(term306644, term306644.getClass(), "year", 2010);
        setShortField(term306644, term306644.getClass(), "month", (short) 3);
        setShortField(term306644, term306644.getClass(), "day", (short) 7);
        setField(term306643, term306643.getClass(), "date", term306644);
        setByteField(term306648, term306648.getClass(), "hour", (byte) 4);
        setByteField(term306648, term306648.getClass(), "minute", (byte) 22);
        setByteField(term306648, term306648.getClass(), "second", (byte) 55);
        setIntField(term306648, term306648.getClass(), "nano", 880504824);
        setField(term306643, term306643.getClass(), "time", term306648);
        setField(term306627, term306627.getClass(), "registerTime", term306643);
        setIntField(term306654, term306654.getClass(), "year", 2024);
        setShortField(term306654, term306654.getClass(), "month", (short) 11);
        setShortField(term306654, term306654.getClass(), "day", (short) 25);
        setField(term306653, term306653.getClass(), "date", term306654);
        setByteField(term306658, term306658.getClass(), "hour", (byte) 1);
        setByteField(term306658, term306658.getClass(), "minute", (byte) 3);
        setByteField(term306658, term306658.getClass(), "second", (byte) 51);
        setIntField(term306658, term306658.getClass(), "nano", 384548224);
        setField(term306653, term306653.getClass(), "time", term306658);
        setField(term306627, term306627.getClass(), "accessTime", term306653);
        setField(term306625, term306625.getClass(), "card", term306627);
        setField(term306625, term306625.getClass(), "userName", "kWvUnnYkTB");
        setIntField(term306625, term306625.getClass(), "level", -716928978);
        setIntField(term306625, term306625.getClass(), "reincarnationNum", -1092562849);
        setLongField(term306625, term306625.getClass(), "exp", -3202911810896417154L);
        setLongField(term306625, term306625.getClass(), "point", 1635445926096450778L);
        setLongField(term306625, term306625.getClass(), "totalPoint", 2729002293954123386L);
        setIntField(term306625, term306625.getClass(), "playCount", 249979911);
        setIntField(term306625, term306625.getClass(), "jewelCount", -1015808608);
        setIntField(term306625, term306625.getClass(), "totalJewelCount", -642571564);
        setIntField(term306625, term306625.getClass(), "medalCount", -1691073345);
        setIntField(term306625, term306625.getClass(), "playerRating", -1193140740);
        setIntField(term306625, term306625.getClass(), "highestRating", -1587301779);
        setIntField(term306625, term306625.getClass(), "battlePoint", -268046415);
        setIntField(term306625, term306625.getClass(), "bestBattlePoint", 25070635);
        setIntField(term306625, term306625.getClass(), "overDamageBattlePoint", 1768435290);
        setBooleanField(term306625, term306625.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term306625, term306625.getClass(), "nameplateId", 813571003);
        setIntField(term306625, term306625.getClass(), "trophyId", 613913808);
        setIntField(term306625, term306625.getClass(), "cardId", 1218208288);
        setIntField(term306625, term306625.getClass(), "characterId", -1723555071);
        setIntField(term306625, term306625.getClass(), "characterVoiceNo", -253585217);
        setIntField(term306625, term306625.getClass(), "tabSetting", -43905294);
        setIntField(term306625, term306625.getClass(), "tabSortSetting", 903044702);
        setIntField(term306625, term306625.getClass(), "cardCategorySetting", 496575552);
        setIntField(term306625, term306625.getClass(), "cardSortSetting", -721070306);
        setIntField(term306625, term306625.getClass(), "rivalScoreCategorySetting", -1512308594);
        setIntField(term306625, term306625.getClass(), "playedTutorialBit", -826658409);
        setIntField(term306625, term306625.getClass(), "firstTutorialCancelNum", 1010337146);
        setLongField(term306625, term306625.getClass(), "sumTechHighScore", -4934959727734765104L);
        setLongField(term306625, term306625.getClass(), "sumTechBasicHighScore", 1662962105918375282L);
        setLongField(term306625, term306625.getClass(), "sumTechAdvancedHighScore", -7370923128020701421L);
        setLongField(term306625, term306625.getClass(), "sumTechExpertHighScore", -4853865000052722438L);
        setLongField(term306625, term306625.getClass(), "sumTechMasterHighScore", 526876311623142681L);
        setLongField(term306625, term306625.getClass(), "sumTechLunaticHighScore", -5401790830969475800L);
        setLongField(term306625, term306625.getClass(), "sumBattleHighScore", 7288068673938669942L);
        setLongField(term306625, term306625.getClass(), "sumBattleBasicHighScore", 6106946919320536147L);
        setLongField(term306625, term306625.getClass(), "sumBattleAdvancedHighScore", 4065108055987580473L);
        setLongField(term306625, term306625.getClass(), "sumBattleExpertHighScore", 5354786928697710366L);
        setLongField(term306625, term306625.getClass(), "sumBattleMasterHighScore", -571714650967221354L);
        setLongField(term306625, term306625.getClass(), "sumBattleLunaticHighScore", 4686919211322162356L);
        setField(term306625, term306625.getClass(), "eventWatchedDate", "xUdwyFAEKn");
        setField(term306625, term306625.getClass(), "cmEventWatchedDate", "SKPObQHnYm");
        setField(term306625, term306625.getClass(), "firstGameId", "ZcUGgeWFzY");
        setField(term306625, term306625.getClass(), "firstRomVersion", "mPJNZAkiwl");
        setField(term306625, term306625.getClass(), "firstDataVersion", "RNQPquGEUU");
        setField(term306625, term306625.getClass(), "firstPlayDate", "KKEVepiIpV");
        setField(term306625, term306625.getClass(), "lastGameId", "acFpjOqFxM");
        setField(term306625, term306625.getClass(), "lastRomVersion", "JKrIhwugSB");
        setField(term306625, term306625.getClass(), "lastDataVersion", "xfIshpKhxl");
        setField(term306625, term306625.getClass(), "compatibleCmVersion", "JwAMbyDsCd");
        setField(term306625, term306625.getClass(), "lastPlayDate", "jjiEzphWfP");
        setIntField(term306625, term306625.getClass(), "lastPlaceId", -1076936509);
        setField(term306625, term306625.getClass(), "lastPlaceName", "vfJNCQdABx");
        setIntField(term306625, term306625.getClass(), "lastRegionId", 1772973336);
        setField(term306625, term306625.getClass(), "lastRegionName", "UaOaphsPNu");
        setIntField(term306625, term306625.getClass(), "lastAllNetId", -1826915997);
        setField(term306625, term306625.getClass(), "lastClientId", "PVNHLparYg");
        setIntField(term306625, term306625.getClass(), "lastUsedDeckId", 412630021);
        setIntField(term306625, term306625.getClass(), "lastPlayMusicLevel", 711881458);
        setIntField(term306625, term306625.getClass(), "lastEmoneyBrand", -1210162042);
        setField(term306623, term306623.getClass(), "user", term306625);
        setIntField(term306623, term306623.getClass(), "bonusId", 1537040246);
        setIntField(term306623, term306623.getClass(), "bonusCount", -165158827);
        setField(term306623, term306623.getClass(), "lastUpdateDate", "lVuSpxrheO");
        term306902 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term306902;
        callMethod(klass, "canEqual", argTypes, term306623, args);
    }

};


