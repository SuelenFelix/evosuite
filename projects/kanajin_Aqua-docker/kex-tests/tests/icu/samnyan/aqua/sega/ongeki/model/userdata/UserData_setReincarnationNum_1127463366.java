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

public class UserData_setReincarnationNum_1127463366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49908;
     Object term50171;

    public UserData_setReincarnationNum_1127463366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49912 = new Long(-4393710401270724527L);
        term49908 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term49910 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term49926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49931 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49941 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term49908, term49908.getClass(), "id", -7979131537588306481L);
        setLongField(term49910, term49910.getClass(), "id", 1914754471514802967L);
        setField(term49910, term49910.getClass(), "extId", term49912);
        setField(term49910, term49910.getClass(), "luid", "MiankJgKCp");
        setIntField(term49927, term49927.getClass(), "year", 2028);
        setShortField(term49927, term49927.getClass(), "month", (short) 3);
        setShortField(term49927, term49927.getClass(), "day", (short) 20);
        setField(term49926, term49926.getClass(), "date", term49927);
        setByteField(term49931, term49931.getClass(), "hour", (byte) 15);
        setByteField(term49931, term49931.getClass(), "minute", (byte) 5);
        setByteField(term49931, term49931.getClass(), "second", (byte) 16);
        setIntField(term49931, term49931.getClass(), "nano", 223082659);
        setField(term49926, term49926.getClass(), "time", term49931);
        setField(term49910, term49910.getClass(), "registerTime", term49926);
        setIntField(term49937, term49937.getClass(), "year", 2019);
        setShortField(term49937, term49937.getClass(), "month", (short) 4);
        setShortField(term49937, term49937.getClass(), "day", (short) 1);
        setField(term49936, term49936.getClass(), "date", term49937);
        setByteField(term49941, term49941.getClass(), "hour", (byte) 8);
        setByteField(term49941, term49941.getClass(), "minute", (byte) 11);
        setByteField(term49941, term49941.getClass(), "second", (byte) 4);
        setIntField(term49941, term49941.getClass(), "nano", 648208624);
        setField(term49936, term49936.getClass(), "time", term49941);
        setField(term49910, term49910.getClass(), "accessTime", term49936);
        setField(term49908, term49908.getClass(), "card", term49910);
        setField(term49908, term49908.getClass(), "userName", "lmZBCmpOeb");
        setIntField(term49908, term49908.getClass(), "level", 1020857327);
        setIntField(term49908, term49908.getClass(), "reincarnationNum", 587603547);
        setLongField(term49908, term49908.getClass(), "exp", 2773198289980268296L);
        setLongField(term49908, term49908.getClass(), "point", 632360974898166826L);
        setLongField(term49908, term49908.getClass(), "totalPoint", -4867174099943207188L);
        setIntField(term49908, term49908.getClass(), "playCount", -1049371381);
        setIntField(term49908, term49908.getClass(), "jewelCount", -331201186);
        setIntField(term49908, term49908.getClass(), "totalJewelCount", 406731696);
        setIntField(term49908, term49908.getClass(), "medalCount", 690233885);
        setIntField(term49908, term49908.getClass(), "playerRating", -1482271539);
        setIntField(term49908, term49908.getClass(), "highestRating", 52686140);
        setIntField(term49908, term49908.getClass(), "battlePoint", -352835881);
        setIntField(term49908, term49908.getClass(), "bestBattlePoint", 2119021005);
        setIntField(term49908, term49908.getClass(), "overDamageBattlePoint", 1361925101);
        setBooleanField(term49908, term49908.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term49908, term49908.getClass(), "nameplateId", -1702583840);
        setIntField(term49908, term49908.getClass(), "trophyId", -1496594860);
        setIntField(term49908, term49908.getClass(), "cardId", -1754638525);
        setIntField(term49908, term49908.getClass(), "characterId", -1058018356);
        setIntField(term49908, term49908.getClass(), "characterVoiceNo", -618930598);
        setIntField(term49908, term49908.getClass(), "tabSetting", -1912835189);
        setIntField(term49908, term49908.getClass(), "tabSortSetting", 1508089655);
        setIntField(term49908, term49908.getClass(), "cardCategorySetting", 1344738281);
        setIntField(term49908, term49908.getClass(), "cardSortSetting", 2137586016);
        setIntField(term49908, term49908.getClass(), "rivalScoreCategorySetting", 718944255);
        setIntField(term49908, term49908.getClass(), "playedTutorialBit", -255278880);
        setIntField(term49908, term49908.getClass(), "firstTutorialCancelNum", 978936508);
        setLongField(term49908, term49908.getClass(), "sumTechHighScore", -6992366326063551384L);
        setLongField(term49908, term49908.getClass(), "sumTechBasicHighScore", -257489281168692227L);
        setLongField(term49908, term49908.getClass(), "sumTechAdvancedHighScore", -3201501634740088518L);
        setLongField(term49908, term49908.getClass(), "sumTechExpertHighScore", -2456846159547925075L);
        setLongField(term49908, term49908.getClass(), "sumTechMasterHighScore", 5303304865916931742L);
        setLongField(term49908, term49908.getClass(), "sumTechLunaticHighScore", 3743553196561690809L);
        setLongField(term49908, term49908.getClass(), "sumBattleHighScore", -4100683915919317973L);
        setLongField(term49908, term49908.getClass(), "sumBattleBasicHighScore", -4411561243835140657L);
        setLongField(term49908, term49908.getClass(), "sumBattleAdvancedHighScore", 8046359617233364561L);
        setLongField(term49908, term49908.getClass(), "sumBattleExpertHighScore", -1294722164117772682L);
        setLongField(term49908, term49908.getClass(), "sumBattleMasterHighScore", -7742919499730303003L);
        setLongField(term49908, term49908.getClass(), "sumBattleLunaticHighScore", 7937367749233415214L);
        setField(term49908, term49908.getClass(), "eventWatchedDate", "cPlYOAUqsP");
        setField(term49908, term49908.getClass(), "cmEventWatchedDate", "ritBUyuuKt");
        setField(term49908, term49908.getClass(), "firstGameId", "YfziBBiPvL");
        setField(term49908, term49908.getClass(), "firstRomVersion", "lNBaHEkYui");
        setField(term49908, term49908.getClass(), "firstDataVersion", "BqxRCYZwmn");
        setField(term49908, term49908.getClass(), "firstPlayDate", "KHPDZjrXQp");
        setField(term49908, term49908.getClass(), "lastGameId", "fpyUFzdCwQ");
        setField(term49908, term49908.getClass(), "lastRomVersion", "OQqBkSGDem");
        setField(term49908, term49908.getClass(), "lastDataVersion", "vZzZOvsIYn");
        setField(term49908, term49908.getClass(), "compatibleCmVersion", "pAIBwhAbDu");
        setField(term49908, term49908.getClass(), "lastPlayDate", "iqhNUjVbRG");
        setIntField(term49908, term49908.getClass(), "lastPlaceId", -782282859);
        setField(term49908, term49908.getClass(), "lastPlaceName", "SSqIrPwJXd");
        setIntField(term49908, term49908.getClass(), "lastRegionId", -289872820);
        setField(term49908, term49908.getClass(), "lastRegionName", "jAxYagPvcV");
        setIntField(term49908, term49908.getClass(), "lastAllNetId", 999463901);
        setField(term49908, term49908.getClass(), "lastClientId", "ZXLgGUqgyW");
        setIntField(term49908, term49908.getClass(), "lastUsedDeckId", -1558642750);
        setIntField(term49908, term49908.getClass(), "lastPlayMusicLevel", 1177832973);
        setIntField(term49908, term49908.getClass(), "lastEmoneyBrand", -808639910);
        term50171 = new Integer(-2087767976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term50171;
        callMethod(klass, "setReincarnationNum", argTypes, term49908, args);
    }

};


