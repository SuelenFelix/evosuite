package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserCharacter_toString_21093363326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119844;

    public UserCharacter_toString_21093363326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term119850 = new Long(21047099434645581L);
        term119844 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term119846 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term119848 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term119864 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119865 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119869 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119874 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119875 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119879 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119901 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119962 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120010 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120056 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term119844, term119844.getClass(), "id", 2173815786681385665L);
        setLongField(term119846, term119846.getClass(), "id", 6673648627982640630L);
        setLongField(term119848, term119848.getClass(), "id", -4710542328870024553L);
        setField(term119848, term119848.getClass(), "extId", term119850);
        setField(term119848, term119848.getClass(), "luid", "deRevaCteK");
        setIntField(term119865, term119865.getClass(), "year", 2023);
        setShortField(term119865, term119865.getClass(), "month", (short) 8);
        setShortField(term119865, term119865.getClass(), "day", (short) 19);
        setField(term119864, term119864.getClass(), "date", term119865);
        setByteField(term119869, term119869.getClass(), "hour", (byte) 12);
        setByteField(term119869, term119869.getClass(), "minute", (byte) 42);
        setByteField(term119869, term119869.getClass(), "second", (byte) 29);
        setIntField(term119869, term119869.getClass(), "nano", 465730414);
        setField(term119864, term119864.getClass(), "time", term119869);
        setField(term119848, term119848.getClass(), "registerTime", term119864);
        setIntField(term119875, term119875.getClass(), "year", 2011);
        setShortField(term119875, term119875.getClass(), "month", (short) 11);
        setShortField(term119875, term119875.getClass(), "day", (short) 1);
        setField(term119874, term119874.getClass(), "date", term119875);
        setByteField(term119879, term119879.getClass(), "hour", (byte) 18);
        setByteField(term119879, term119879.getClass(), "minute", (byte) 2);
        setByteField(term119879, term119879.getClass(), "second", (byte) 52);
        setIntField(term119879, term119879.getClass(), "nano", 411501611);
        setField(term119874, term119874.getClass(), "time", term119879);
        setField(term119848, term119848.getClass(), "accessTime", term119874);
        setField(term119846, term119846.getClass(), "card", term119848);
        setField(term119846, term119846.getClass(), "userName", "dVepDETefb");
        setIntField(term119897, term119897.getClass(), "year", 2013);
        setShortField(term119897, term119897.getClass(), "month", (short) 12);
        setShortField(term119897, term119897.getClass(), "day", (short) 9);
        setField(term119896, term119896.getClass(), "date", term119897);
        setByteField(term119901, term119901.getClass(), "hour", (byte) 15);
        setByteField(term119901, term119901.getClass(), "minute", (byte) 30);
        setByteField(term119901, term119901.getClass(), "second", (byte) 42);
        setIntField(term119901, term119901.getClass(), "nano", 905822345);
        setField(term119896, term119896.getClass(), "time", term119901);
        setField(term119846, term119846.getClass(), "lastLoginDate", term119896);
        setBooleanField(term119846, term119846.getClass(), "isWebJoin", false);
        setField(term119846, term119846.getClass(), "webLimitDate", "IVzSENeLxP");
        setIntField(term119846, term119846.getClass(), "level", 1340125056);
        setIntField(term119846, term119846.getClass(), "reincarnationNum", -163957346);
        setField(term119846, term119846.getClass(), "exp", "XlXuNQwqYb");
        setLongField(term119846, term119846.getClass(), "point", 711490618640696795L);
        setLongField(term119846, term119846.getClass(), "totalPoint", -8939684594399095164L);
        setIntField(term119846, term119846.getClass(), "playCount", 536808724);
        setIntField(term119846, term119846.getClass(), "multiPlayCount", -534385154);
        setIntField(term119846, term119846.getClass(), "multiWinCount", -1277688883);
        setIntField(term119846, term119846.getClass(), "requestResCount", 2143702118);
        setIntField(term119846, term119846.getClass(), "acceptResCount", -1514256392);
        setIntField(term119846, term119846.getClass(), "successResCount", -706084233);
        setIntField(term119846, term119846.getClass(), "playerRating", 786595172);
        setIntField(term119846, term119846.getClass(), "highestRating", 1090005556);
        setIntField(term119846, term119846.getClass(), "nameplateId", 86451720);
        setIntField(term119846, term119846.getClass(), "frameId", -1916270131);
        setIntField(term119846, term119846.getClass(), "characterId", 430692285);
        setIntField(term119846, term119846.getClass(), "trophyId", 354561212);
        setIntField(term119846, term119846.getClass(), "playedTutorialBit", -1171538201);
        setIntField(term119846, term119846.getClass(), "firstTutorialCancelNum", 1030420582);
        setIntField(term119846, term119846.getClass(), "masterTutorialCancelNum", 1441242370);
        setIntField(term119846, term119846.getClass(), "totalRepertoireCount", -1266421079);
        setIntField(term119846, term119846.getClass(), "totalMapNum", -428024469);
        setLongField(term119846, term119846.getClass(), "totalHiScore", -7748613109503374943L);
        setLongField(term119846, term119846.getClass(), "totalBasicHighScore", -8647371121395122436L);
        setLongField(term119846, term119846.getClass(), "totalAdvancedHighScore", -7377577718146705627L);
        setLongField(term119846, term119846.getClass(), "totalExpertHighScore", -4742652737531811018L);
        setLongField(term119846, term119846.getClass(), "totalMasterHighScore", 7714939142473649868L);
        setIntField(term119958, term119958.getClass(), "year", 2029);
        setShortField(term119958, term119958.getClass(), "month", (short) 5);
        setShortField(term119958, term119958.getClass(), "day", (short) 20);
        setField(term119957, term119957.getClass(), "date", term119958);
        setByteField(term119962, term119962.getClass(), "hour", (byte) 18);
        setByteField(term119962, term119962.getClass(), "minute", (byte) 32);
        setByteField(term119962, term119962.getClass(), "second", (byte) 59);
        setIntField(term119962, term119962.getClass(), "nano", 565196467);
        setField(term119957, term119957.getClass(), "time", term119962);
        setField(term119846, term119846.getClass(), "eventWatchedDate", term119957);
        setIntField(term119846, term119846.getClass(), "friendCount", -428926218);
        setBooleanField(term119846, term119846.getClass(), "isMaimai", false);
        setField(term119846, term119846.getClass(), "firstGameId", "ePtDnXODVc");
        setField(term119846, term119846.getClass(), "firstRomVersion", "NupNPsPxZu");
        setField(term119846, term119846.getClass(), "firstDataVersion", "bOTZrbSitH");
        setIntField(term120006, term120006.getClass(), "year", 2029);
        setShortField(term120006, term120006.getClass(), "month", (short) 3);
        setShortField(term120006, term120006.getClass(), "day", (short) 30);
        setField(term120005, term120005.getClass(), "date", term120006);
        setByteField(term120010, term120010.getClass(), "hour", (byte) 10);
        setByteField(term120010, term120010.getClass(), "minute", (byte) 2);
        setByteField(term120010, term120010.getClass(), "second", (byte) 17);
        setIntField(term120010, term120010.getClass(), "nano", 15429109);
        setField(term120005, term120005.getClass(), "time", term120010);
        setField(term119846, term119846.getClass(), "firstPlayDate", term120005);
        setField(term119846, term119846.getClass(), "lastGameId", "ojFfVocDNH");
        setField(term119846, term119846.getClass(), "lastRomVersion", "gqBOEdccip");
        setField(term119846, term119846.getClass(), "lastDataVersion", "biglNwhOOx");
        setIntField(term120052, term120052.getClass(), "year", 2024);
        setShortField(term120052, term120052.getClass(), "month", (short) 10);
        setShortField(term120052, term120052.getClass(), "day", (short) 1);
        setField(term120051, term120051.getClass(), "date", term120052);
        setByteField(term120056, term120056.getClass(), "hour", (byte) 1);
        setByteField(term120056, term120056.getClass(), "minute", (byte) 25);
        setByteField(term120056, term120056.getClass(), "second", (byte) 24);
        setIntField(term120056, term120056.getClass(), "nano", 259874836);
        setField(term120051, term120051.getClass(), "time", term120056);
        setField(term119846, term119846.getClass(), "lastPlayDate", term120051);
        setIntField(term119846, term119846.getClass(), "lastPlaceId", 1874384865);
        setField(term119846, term119846.getClass(), "lastPlaceName", "mianqYKlGq");
        setField(term119846, term119846.getClass(), "lastRegionId", "GmpbCvsoQd");
        setField(term119846, term119846.getClass(), "lastRegionName", "ypYkYRcFQq");
        setField(term119846, term119846.getClass(), "lastAllNetId", "lXLLmOVwcF");
        setField(term119846, term119846.getClass(), "lastClientId", "lIrBbPBrDY");
        setField(term119844, term119844.getClass(), "user", term119846);
        setIntField(term119844, term119844.getClass(), "characterId", -559576348);
        setIntField(term119844, term119844.getClass(), "playCount", -779864176);
        setIntField(term119844, term119844.getClass(), "level", 1);
        setIntField(term119844, term119844.getClass(), "skillId", -819912343);
        setIntField(term119844, term119844.getClass(), "friendshipExp", 1828884130);
        setBooleanField(term119844, term119844.getClass(), "isValid", true);
        setBooleanField(term119844, term119844.getClass(), "isNewMark", true);
        setIntField(term119844, term119844.getClass(), "param1", -1130376171);
        setIntField(term119844, term119844.getClass(), "param2", 1286975918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term119844, args);
    }

};


