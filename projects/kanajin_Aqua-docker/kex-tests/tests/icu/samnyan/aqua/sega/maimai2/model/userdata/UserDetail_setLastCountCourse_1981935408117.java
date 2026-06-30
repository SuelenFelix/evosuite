package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_setLastCountCourse_1981935408117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4296226;
     Object term4296569;

    public UserDetail_setLastCountCourse_1981935408117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4296230 = new Long(6548056565582320757L);
        Integer term4296293 = new Integer(1550009784);
        ArrayList term4296291 = new ArrayList();
        ((ArrayList) term4296291).add(term4296293);
        Integer term4296299 = new Integer(-1322057757);
        ArrayList term4296297 = new ArrayList();
        ((ArrayList) term4296297).add(term4296299);
        term4296226 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4296228 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4296244 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4296245 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4296249 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4296254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4296255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4296259 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4296226, term4296226.getClass(), "id", 7353273689101372675L);
        setLongField(term4296228, term4296228.getClass(), "id", -9016024123638710587L);
        setField(term4296228, term4296228.getClass(), "extId", term4296230);
        setField(term4296228, term4296228.getClass(), "luid", "RisZBgJcOa");
        setIntField(term4296245, term4296245.getClass(), "year", 2018);
        setShortField(term4296245, term4296245.getClass(), "month", (short) 7);
        setShortField(term4296245, term4296245.getClass(), "day", (short) 21);
        setField(term4296244, term4296244.getClass(), "date", term4296245);
        setByteField(term4296249, term4296249.getClass(), "hour", (byte) 17);
        setByteField(term4296249, term4296249.getClass(), "minute", (byte) 54);
        setByteField(term4296249, term4296249.getClass(), "second", (byte) 39);
        setIntField(term4296249, term4296249.getClass(), "nano", 695401648);
        setField(term4296244, term4296244.getClass(), "time", term4296249);
        setField(term4296228, term4296228.getClass(), "registerTime", term4296244);
        setIntField(term4296255, term4296255.getClass(), "year", 2022);
        setShortField(term4296255, term4296255.getClass(), "month", (short) 6);
        setShortField(term4296255, term4296255.getClass(), "day", (short) 8);
        setField(term4296254, term4296254.getClass(), "date", term4296255);
        setByteField(term4296259, term4296259.getClass(), "hour", (byte) 4);
        setByteField(term4296259, term4296259.getClass(), "minute", (byte) 44);
        setByteField(term4296259, term4296259.getClass(), "second", (byte) 13);
        setIntField(term4296259, term4296259.getClass(), "nano", 913513346);
        setField(term4296254, term4296254.getClass(), "time", term4296259);
        setField(term4296228, term4296228.getClass(), "accessTime", term4296254);
        setField(term4296226, term4296226.getClass(), "card", term4296228);
        setField(term4296226, term4296226.getClass(), "userName", "YVrSDBooJx");
        setIntField(term4296226, term4296226.getClass(), "isNetMember", -1994461123);
        setIntField(term4296226, term4296226.getClass(), "iconId", -83700288);
        setIntField(term4296226, term4296226.getClass(), "plateId", -866647267);
        setIntField(term4296226, term4296226.getClass(), "titleId", -1831675606);
        setIntField(term4296226, term4296226.getClass(), "partnerId", -2129584688);
        setIntField(term4296226, term4296226.getClass(), "frameId", 821338064);
        setIntField(term4296226, term4296226.getClass(), "selectMapId", 1672667195);
        setIntField(term4296226, term4296226.getClass(), "totalAwake", -42832532);
        setIntField(term4296226, term4296226.getClass(), "gradeRating", 43807946);
        setIntField(term4296226, term4296226.getClass(), "musicRating", 563098527);
        setIntField(term4296226, term4296226.getClass(), "playerRating", -859002753);
        setIntField(term4296226, term4296226.getClass(), "highestRating", -1140404847);
        setIntField(term4296226, term4296226.getClass(), "gradeRank", 213478102);
        setIntField(term4296226, term4296226.getClass(), "classRank", -1925211177);
        setIntField(term4296226, term4296226.getClass(), "courseRank", -1558322514);
        setField(term4296226, term4296226.getClass(), "charaSlot", term4296291);
        setField(term4296226, term4296226.getClass(), "charaLockSlot", term4296297);
        setLongField(term4296226, term4296226.getClass(), "contentBit", 1852563801740724619L);
        setIntField(term4296226, term4296226.getClass(), "playCount", -1898284984);
        setField(term4296226, term4296226.getClass(), "eventWatchedDate", "NVkkmLDkTs");
        setField(term4296226, term4296226.getClass(), "lastGameId", "ZZeFBNWUDM");
        setField(term4296226, term4296226.getClass(), "lastRomVersion", "KlvPYGsEnO");
        setField(term4296226, term4296226.getClass(), "lastDataVersion", "XFlQzCfRfC");
        setField(term4296226, term4296226.getClass(), "lastLoginDate", "CjDHEejmWS");
        setField(term4296226, term4296226.getClass(), "lastPlayDate", "MFRntPRdTO");
        setIntField(term4296226, term4296226.getClass(), "lastPlayCredit", -878806305);
        setIntField(term4296226, term4296226.getClass(), "lastPlayMode", 1652630964);
        setIntField(term4296226, term4296226.getClass(), "lastPlaceId", -2068078549);
        setField(term4296226, term4296226.getClass(), "lastPlaceName", "CYpUDnMEcZ");
        setIntField(term4296226, term4296226.getClass(), "lastAllNetId", 465110415);
        setIntField(term4296226, term4296226.getClass(), "lastRegionId", -1881590880);
        setField(term4296226, term4296226.getClass(), "lastRegionName", "TFHcXeLCug");
        setField(term4296226, term4296226.getClass(), "lastClientId", "WqqxWtNxnE");
        setField(term4296226, term4296226.getClass(), "lastCountryCode", "rWrBjbSmPG");
        setIntField(term4296226, term4296226.getClass(), "lastSelectEMoney", 1058770446);
        setIntField(term4296226, term4296226.getClass(), "lastSelectTicket", -307216465);
        setIntField(term4296226, term4296226.getClass(), "lastSelectCourse", -1483225772);
        setIntField(term4296226, term4296226.getClass(), "lastCountCourse", -791602309);
        setField(term4296226, term4296226.getClass(), "firstGameId", "hREYvmrtUn");
        setField(term4296226, term4296226.getClass(), "firstRomVersion", "zAWOLeBhfu");
        setField(term4296226, term4296226.getClass(), "firstDataVersion", "GHbKcTAsom");
        setField(term4296226, term4296226.getClass(), "firstPlayDate", "wUHGdrmalx");
        setField(term4296226, term4296226.getClass(), "compatibleCmVersion", "JelRFfktKR");
        setField(term4296226, term4296226.getClass(), "dailyBonusDate", "QRpAoArtdm");
        setField(term4296226, term4296226.getClass(), "dailyCourseBonusDate", "yaDBUJefrH");
        setField(term4296226, term4296226.getClass(), "lastPairLoginDate", "bOEcxPVvCF");
        setField(term4296226, term4296226.getClass(), "lastTrialPlayDate", "BnjKhOHQmz");
        setIntField(term4296226, term4296226.getClass(), "playVsCount", -101090666);
        setIntField(term4296226, term4296226.getClass(), "playSyncCount", -602855624);
        setIntField(term4296226, term4296226.getClass(), "winCount", 2111251551);
        setIntField(term4296226, term4296226.getClass(), "helpCount", -1636532854);
        setIntField(term4296226, term4296226.getClass(), "comboCount", -1335049377);
        setLongField(term4296226, term4296226.getClass(), "totalDeluxscore", 8379164455787682705L);
        setLongField(term4296226, term4296226.getClass(), "totalBasicDeluxscore", 580264411117796312L);
        setLongField(term4296226, term4296226.getClass(), "totalAdvancedDeluxscore", -8495642425032094964L);
        setLongField(term4296226, term4296226.getClass(), "totalExpertDeluxscore", -7980462091848200313L);
        setLongField(term4296226, term4296226.getClass(), "totalMasterDeluxscore", -8772043919122064414L);
        setLongField(term4296226, term4296226.getClass(), "totalReMasterDeluxscore", -4138504625548856911L);
        setIntField(term4296226, term4296226.getClass(), "totalSync", 660711746);
        setIntField(term4296226, term4296226.getClass(), "totalBasicSync", 1664809838);
        setIntField(term4296226, term4296226.getClass(), "totalAdvancedSync", -650349580);
        setIntField(term4296226, term4296226.getClass(), "totalExpertSync", -1633791840);
        setIntField(term4296226, term4296226.getClass(), "totalMasterSync", -1843230412);
        setIntField(term4296226, term4296226.getClass(), "totalReMasterSync", -1275712351);
        setLongField(term4296226, term4296226.getClass(), "totalAchievement", 7941724353197604449L);
        setLongField(term4296226, term4296226.getClass(), "totalBasicAchievement", 2590459199890261580L);
        setLongField(term4296226, term4296226.getClass(), "totalAdvancedAchievement", -6244598169034059136L);
        setLongField(term4296226, term4296226.getClass(), "totalExpertAchievement", 410580314443501520L);
        setLongField(term4296226, term4296226.getClass(), "totalMasterAchievement", -8452977526519770590L);
        setLongField(term4296226, term4296226.getClass(), "totalReMasterAchievement", -6966255048645989091L);
        setLongField(term4296226, term4296226.getClass(), "playerOldRating", 5609455433144327068L);
        setLongField(term4296226, term4296226.getClass(), "playerNewRating", 2545361751519482267L);
        setIntField(term4296226, term4296226.getClass(), "banState", 1018610561);
        setLongField(term4296226, term4296226.getClass(), "dateTime", 9190767081030869108L);
        term4296569 = new Integer(1006080183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4296569;
        callMethod(klass, "setLastCountCourse", argTypes, term4296226, args);
    }

};


