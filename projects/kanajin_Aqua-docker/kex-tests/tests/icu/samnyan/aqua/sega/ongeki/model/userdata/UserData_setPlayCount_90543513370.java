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

public class UserData_setPlayCount_90543513370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51608;
     Object term51871;

    public UserData_setPlayCount_90543513370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51612 = new Long(5671808784468963649L);
        term51608 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term51610 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term51626 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51627 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51631 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51636 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51637 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51641 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term51608, term51608.getClass(), "id", 7703860081138133014L);
        setLongField(term51610, term51610.getClass(), "id", -5836140469306562215L);
        setField(term51610, term51610.getClass(), "extId", term51612);
        setField(term51610, term51610.getClass(), "luid", "CpdMEgjUka");
        setIntField(term51627, term51627.getClass(), "year", 2018);
        setShortField(term51627, term51627.getClass(), "month", (short) 2);
        setShortField(term51627, term51627.getClass(), "day", (short) 4);
        setField(term51626, term51626.getClass(), "date", term51627);
        setByteField(term51631, term51631.getClass(), "hour", (byte) 5);
        setByteField(term51631, term51631.getClass(), "minute", (byte) 35);
        setByteField(term51631, term51631.getClass(), "second", (byte) 40);
        setIntField(term51631, term51631.getClass(), "nano", 354661894);
        setField(term51626, term51626.getClass(), "time", term51631);
        setField(term51610, term51610.getClass(), "registerTime", term51626);
        setIntField(term51637, term51637.getClass(), "year", 2010);
        setShortField(term51637, term51637.getClass(), "month", (short) 3);
        setShortField(term51637, term51637.getClass(), "day", (short) 23);
        setField(term51636, term51636.getClass(), "date", term51637);
        setByteField(term51641, term51641.getClass(), "hour", (byte) 17);
        setByteField(term51641, term51641.getClass(), "minute", (byte) 32);
        setByteField(term51641, term51641.getClass(), "second", (byte) 36);
        setIntField(term51641, term51641.getClass(), "nano", 470582535);
        setField(term51636, term51636.getClass(), "time", term51641);
        setField(term51610, term51610.getClass(), "accessTime", term51636);
        setField(term51608, term51608.getClass(), "card", term51610);
        setField(term51608, term51608.getClass(), "userName", "WRisHdgnmm");
        setIntField(term51608, term51608.getClass(), "level", -769314399);
        setIntField(term51608, term51608.getClass(), "reincarnationNum", -59737304);
        setLongField(term51608, term51608.getClass(), "exp", -9007332134350463845L);
        setLongField(term51608, term51608.getClass(), "point", 8545694832530342054L);
        setLongField(term51608, term51608.getClass(), "totalPoint", -2935013818936662643L);
        setIntField(term51608, term51608.getClass(), "playCount", -1878753007);
        setIntField(term51608, term51608.getClass(), "jewelCount", -411059650);
        setIntField(term51608, term51608.getClass(), "totalJewelCount", 811517871);
        setIntField(term51608, term51608.getClass(), "medalCount", -74980095);
        setIntField(term51608, term51608.getClass(), "playerRating", -1303503886);
        setIntField(term51608, term51608.getClass(), "highestRating", -199463835);
        setIntField(term51608, term51608.getClass(), "battlePoint", 847764025);
        setIntField(term51608, term51608.getClass(), "bestBattlePoint", 436004216);
        setIntField(term51608, term51608.getClass(), "overDamageBattlePoint", 1327592820);
        setBooleanField(term51608, term51608.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term51608, term51608.getClass(), "nameplateId", 1056183374);
        setIntField(term51608, term51608.getClass(), "trophyId", 908916188);
        setIntField(term51608, term51608.getClass(), "cardId", -2066943126);
        setIntField(term51608, term51608.getClass(), "characterId", 670556171);
        setIntField(term51608, term51608.getClass(), "characterVoiceNo", -1727494705);
        setIntField(term51608, term51608.getClass(), "tabSetting", -1168439000);
        setIntField(term51608, term51608.getClass(), "tabSortSetting", -1552818345);
        setIntField(term51608, term51608.getClass(), "cardCategorySetting", -811708149);
        setIntField(term51608, term51608.getClass(), "cardSortSetting", 2060766727);
        setIntField(term51608, term51608.getClass(), "rivalScoreCategorySetting", 1298229635);
        setIntField(term51608, term51608.getClass(), "playedTutorialBit", -569196422);
        setIntField(term51608, term51608.getClass(), "firstTutorialCancelNum", -394638810);
        setLongField(term51608, term51608.getClass(), "sumTechHighScore", -8356746197417996521L);
        setLongField(term51608, term51608.getClass(), "sumTechBasicHighScore", 1588756868689872678L);
        setLongField(term51608, term51608.getClass(), "sumTechAdvancedHighScore", 2841025204772034361L);
        setLongField(term51608, term51608.getClass(), "sumTechExpertHighScore", -6951863671075383168L);
        setLongField(term51608, term51608.getClass(), "sumTechMasterHighScore", 444711052508404757L);
        setLongField(term51608, term51608.getClass(), "sumTechLunaticHighScore", -4433754356855281318L);
        setLongField(term51608, term51608.getClass(), "sumBattleHighScore", -8219871028565555567L);
        setLongField(term51608, term51608.getClass(), "sumBattleBasicHighScore", -4664784590063321060L);
        setLongField(term51608, term51608.getClass(), "sumBattleAdvancedHighScore", -8176783923061900011L);
        setLongField(term51608, term51608.getClass(), "sumBattleExpertHighScore", -9018044396967594984L);
        setLongField(term51608, term51608.getClass(), "sumBattleMasterHighScore", -545192431010524816L);
        setLongField(term51608, term51608.getClass(), "sumBattleLunaticHighScore", 6466572752098109458L);
        setField(term51608, term51608.getClass(), "eventWatchedDate", "XxZiwWPLOx");
        setField(term51608, term51608.getClass(), "cmEventWatchedDate", "nyqsjMHTba");
        setField(term51608, term51608.getClass(), "firstGameId", "ylUHzURWyg");
        setField(term51608, term51608.getClass(), "firstRomVersion", "VuAuFBlHxQ");
        setField(term51608, term51608.getClass(), "firstDataVersion", "nOLtCslMMH");
        setField(term51608, term51608.getClass(), "firstPlayDate", "dIQWOeKQVj");
        setField(term51608, term51608.getClass(), "lastGameId", "tHiDGaNXAL");
        setField(term51608, term51608.getClass(), "lastRomVersion", "VsizBWhPWL");
        setField(term51608, term51608.getClass(), "lastDataVersion", "jAFSxnVMcD");
        setField(term51608, term51608.getClass(), "compatibleCmVersion", "BuNQAVaNCe");
        setField(term51608, term51608.getClass(), "lastPlayDate", "iaYiUQnOLD");
        setIntField(term51608, term51608.getClass(), "lastPlaceId", 790706322);
        setField(term51608, term51608.getClass(), "lastPlaceName", "upnleTLVdf");
        setIntField(term51608, term51608.getClass(), "lastRegionId", 699712077);
        setField(term51608, term51608.getClass(), "lastRegionName", "pvjlKAnxzJ");
        setIntField(term51608, term51608.getClass(), "lastAllNetId", -97640679);
        setField(term51608, term51608.getClass(), "lastClientId", "ejxUBDQQKB");
        setIntField(term51608, term51608.getClass(), "lastUsedDeckId", 1484085042);
        setIntField(term51608, term51608.getClass(), "lastPlayMusicLevel", 1777726456);
        setIntField(term51608, term51608.getClass(), "lastEmoneyBrand", -1376824764);
        term51871 = new Integer(-1173622754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term51871;
        callMethod(klass, "setPlayCount", argTypes, term51608, args);
    }

};


