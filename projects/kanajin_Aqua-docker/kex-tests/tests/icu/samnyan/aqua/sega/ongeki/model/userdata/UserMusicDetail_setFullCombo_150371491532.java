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
import java.lang.Boolean;

public class UserMusicDetail_setFullCombo_150371491532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418289;
     Object term418570;

    public UserMusicDetail_setFullCombo_150371491532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term418295 = new Long(8242382965219431687L);
        term418289 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term418291 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term418293 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term418309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term418310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term418314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term418319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term418320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term418324 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term418289, term418289.getClass(), "id", 8027767098160130239L);
        setLongField(term418291, term418291.getClass(), "id", -2195928211818108031L);
        setLongField(term418293, term418293.getClass(), "id", -5099095234477005125L);
        setField(term418293, term418293.getClass(), "extId", term418295);
        setField(term418293, term418293.getClass(), "luid", "RUrblBmkmR");
        setIntField(term418310, term418310.getClass(), "year", 2018);
        setShortField(term418310, term418310.getClass(), "month", (short) 11);
        setShortField(term418310, term418310.getClass(), "day", (short) 27);
        setField(term418309, term418309.getClass(), "date", term418310);
        setByteField(term418314, term418314.getClass(), "hour", (byte) 4);
        setByteField(term418314, term418314.getClass(), "minute", (byte) 0);
        setByteField(term418314, term418314.getClass(), "second", (byte) 11);
        setIntField(term418314, term418314.getClass(), "nano", 685942391);
        setField(term418309, term418309.getClass(), "time", term418314);
        setField(term418293, term418293.getClass(), "registerTime", term418309);
        setIntField(term418320, term418320.getClass(), "year", 2022);
        setShortField(term418320, term418320.getClass(), "month", (short) 6);
        setShortField(term418320, term418320.getClass(), "day", (short) 11);
        setField(term418319, term418319.getClass(), "date", term418320);
        setByteField(term418324, term418324.getClass(), "hour", (byte) 17);
        setByteField(term418324, term418324.getClass(), "minute", (byte) 9);
        setByteField(term418324, term418324.getClass(), "second", (byte) 40);
        setIntField(term418324, term418324.getClass(), "nano", 253206883);
        setField(term418319, term418319.getClass(), "time", term418324);
        setField(term418293, term418293.getClass(), "accessTime", term418319);
        setField(term418291, term418291.getClass(), "card", term418293);
        setField(term418291, term418291.getClass(), "userName", "NEpFDUxwgv");
        setIntField(term418291, term418291.getClass(), "level", -1966046781);
        setIntField(term418291, term418291.getClass(), "reincarnationNum", 90461467);
        setLongField(term418291, term418291.getClass(), "exp", -8895293987835775051L);
        setLongField(term418291, term418291.getClass(), "point", 8212771791033832710L);
        setLongField(term418291, term418291.getClass(), "totalPoint", -354226536074311302L);
        setIntField(term418291, term418291.getClass(), "playCount", -1014646259);
        setIntField(term418291, term418291.getClass(), "jewelCount", 1138785025);
        setIntField(term418291, term418291.getClass(), "totalJewelCount", 473353645);
        setIntField(term418291, term418291.getClass(), "medalCount", 562683189);
        setIntField(term418291, term418291.getClass(), "playerRating", -1741326420);
        setIntField(term418291, term418291.getClass(), "highestRating", -2063986909);
        setIntField(term418291, term418291.getClass(), "battlePoint", 983539154);
        setIntField(term418291, term418291.getClass(), "bestBattlePoint", -1593057570);
        setIntField(term418291, term418291.getClass(), "overDamageBattlePoint", 1952832276);
        setBooleanField(term418291, term418291.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term418291, term418291.getClass(), "nameplateId", -963558580);
        setIntField(term418291, term418291.getClass(), "trophyId", 2017339048);
        setIntField(term418291, term418291.getClass(), "cardId", 636205850);
        setIntField(term418291, term418291.getClass(), "characterId", -286425849);
        setIntField(term418291, term418291.getClass(), "characterVoiceNo", -1697866124);
        setIntField(term418291, term418291.getClass(), "tabSetting", 2108954676);
        setIntField(term418291, term418291.getClass(), "tabSortSetting", 1655965915);
        setIntField(term418291, term418291.getClass(), "cardCategorySetting", -438352144);
        setIntField(term418291, term418291.getClass(), "cardSortSetting", 1500312978);
        setIntField(term418291, term418291.getClass(), "rivalScoreCategorySetting", 2069814991);
        setIntField(term418291, term418291.getClass(), "playedTutorialBit", 1832730739);
        setIntField(term418291, term418291.getClass(), "firstTutorialCancelNum", 356625224);
        setLongField(term418291, term418291.getClass(), "sumTechHighScore", 7225725150916859396L);
        setLongField(term418291, term418291.getClass(), "sumTechBasicHighScore", 5767129656234891004L);
        setLongField(term418291, term418291.getClass(), "sumTechAdvancedHighScore", 1699652267208919296L);
        setLongField(term418291, term418291.getClass(), "sumTechExpertHighScore", -876723248317946841L);
        setLongField(term418291, term418291.getClass(), "sumTechMasterHighScore", -4561955660470908816L);
        setLongField(term418291, term418291.getClass(), "sumTechLunaticHighScore", -5281590225121807219L);
        setLongField(term418291, term418291.getClass(), "sumBattleHighScore", 8275649557201078396L);
        setLongField(term418291, term418291.getClass(), "sumBattleBasicHighScore", -5892210530974943347L);
        setLongField(term418291, term418291.getClass(), "sumBattleAdvancedHighScore", -4102872141775087167L);
        setLongField(term418291, term418291.getClass(), "sumBattleExpertHighScore", -5075379227679714640L);
        setLongField(term418291, term418291.getClass(), "sumBattleMasterHighScore", -3419624119152503727L);
        setLongField(term418291, term418291.getClass(), "sumBattleLunaticHighScore", 5242217468929273430L);
        setField(term418291, term418291.getClass(), "eventWatchedDate", "otuljPrinT");
        setField(term418291, term418291.getClass(), "cmEventWatchedDate", "DfhIlWFExl");
        setField(term418291, term418291.getClass(), "firstGameId", "kHmAzNnMoO");
        setField(term418291, term418291.getClass(), "firstRomVersion", "IdMxPACDwC");
        setField(term418291, term418291.getClass(), "firstDataVersion", "AFboEcRXGW");
        setField(term418291, term418291.getClass(), "firstPlayDate", "CFtxJbrWVn");
        setField(term418291, term418291.getClass(), "lastGameId", "bYpWSnQPmA");
        setField(term418291, term418291.getClass(), "lastRomVersion", "HyMhgjUHjX");
        setField(term418291, term418291.getClass(), "lastDataVersion", "jQIIBkgWNf");
        setField(term418291, term418291.getClass(), "compatibleCmVersion", "pfeseEDWcb");
        setField(term418291, term418291.getClass(), "lastPlayDate", "LknkgEQsHF");
        setIntField(term418291, term418291.getClass(), "lastPlaceId", -1666562514);
        setField(term418291, term418291.getClass(), "lastPlaceName", "gYNJeaIqnc");
        setIntField(term418291, term418291.getClass(), "lastRegionId", -1741575123);
        setField(term418291, term418291.getClass(), "lastRegionName", "QNPiJdzvnW");
        setIntField(term418291, term418291.getClass(), "lastAllNetId", -1655887293);
        setField(term418291, term418291.getClass(), "lastClientId", "SbqeFrwhoC");
        setIntField(term418291, term418291.getClass(), "lastUsedDeckId", 1146519611);
        setIntField(term418291, term418291.getClass(), "lastPlayMusicLevel", -563403213);
        setIntField(term418291, term418291.getClass(), "lastEmoneyBrand", -1606906725);
        setField(term418289, term418289.getClass(), "user", term418291);
        setIntField(term418289, term418289.getClass(), "musicId", 842138808);
        setIntField(term418289, term418289.getClass(), "level", -1045208950);
        setIntField(term418289, term418289.getClass(), "playCount", 1071832329);
        setIntField(term418289, term418289.getClass(), "techScoreMax", -2082403193);
        setIntField(term418289, term418289.getClass(), "techScoreRank", -686451336);
        setIntField(term418289, term418289.getClass(), "battleScoreMax", 1342486194);
        setIntField(term418289, term418289.getClass(), "battleScoreRank", 298809827);
        setIntField(term418289, term418289.getClass(), "maxComboCount", -1880542651);
        setIntField(term418289, term418289.getClass(), "maxOverKill", 1624480215);
        setIntField(term418289, term418289.getClass(), "maxTeamOverKill", -430713266);
        setBooleanField(term418289, term418289.getClass(), "isFullBell", false);
        setBooleanField(term418289, term418289.getClass(), "isFullCombo", false);
        setBooleanField(term418289, term418289.getClass(), "isAllBreake", true);
        setBooleanField(term418289, term418289.getClass(), "isLock", true);
        setIntField(term418289, term418289.getClass(), "clearStatus", -850232491);
        setBooleanField(term418289, term418289.getClass(), "isStoryWatched", true);
        term418570 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term418570;
        callMethod(klass, "setFullCombo", argTypes, term418289, args);
    }

};


