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

public class UserExtend_isGotoCodeRead_110929560111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147923;

    public UserExtend_isGotoCodeRead_110929560111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term147929 = new Long(-4867941246533901410L);
        Integer term147992 = new Integer(-1031499401);
        Integer term147994 = new Integer(280202002);
        Integer term147996 = new Integer(-1074402599);
        Integer term147998 = new Integer(-1867539151);
        Integer term148000 = new Integer(-816430246);
        Integer term148002 = new Integer(1754193865);
        Integer term148004 = new Integer(25277058);
        Integer term148006 = new Integer(-949634053);
        ArrayList term147990 = new ArrayList();
        ((ArrayList) term147990).add(term147992);
        ((ArrayList) term147990).add(term147994);
        ((ArrayList) term147990).add(term147996);
        ((ArrayList) term147990).add(term147998);
        ((ArrayList) term147990).add(term148000);
        ((ArrayList) term147990).add(term148002);
        ((ArrayList) term147990).add(term148004);
        ((ArrayList) term147990).add(term148006);
        Integer term148012 = new Integer(1495471055);
        Integer term148014 = new Integer(-583415628);
        Integer term148016 = new Integer(-1488660931);
        Integer term148018 = new Integer(1899095931);
        ArrayList term148010 = new ArrayList();
        ((ArrayList) term148010).add(term148012);
        ((ArrayList) term148010).add(term148014);
        ((ArrayList) term148010).add(term148016);
        ((ArrayList) term148010).add(term148018);
        ArrayList term148300 = new ArrayList();
        ArrayList term148304 = new ArrayList();
        term147923 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term147925 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term147927 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term147943 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147944 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147948 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147953 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147954 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147958 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term147923, term147923.getClass(), "id", 7429851199217394608L);
        setLongField(term147925, term147925.getClass(), "id", 3921884426788904908L);
        setLongField(term147927, term147927.getClass(), "id", -1237733525270115209L);
        setField(term147927, term147927.getClass(), "extId", term147929);
        setField(term147927, term147927.getClass(), "luid", "hecboVcqgp");
        setIntField(term147944, term147944.getClass(), "year", 2023);
        setShortField(term147944, term147944.getClass(), "month", (short) 3);
        setShortField(term147944, term147944.getClass(), "day", (short) 9);
        setField(term147943, term147943.getClass(), "date", term147944);
        setByteField(term147948, term147948.getClass(), "hour", (byte) 0);
        setByteField(term147948, term147948.getClass(), "minute", (byte) 39);
        setByteField(term147948, term147948.getClass(), "second", (byte) 8);
        setIntField(term147948, term147948.getClass(), "nano", 231503726);
        setField(term147943, term147943.getClass(), "time", term147948);
        setField(term147927, term147927.getClass(), "registerTime", term147943);
        setIntField(term147954, term147954.getClass(), "year", 2018);
        setShortField(term147954, term147954.getClass(), "month", (short) 4);
        setShortField(term147954, term147954.getClass(), "day", (short) 18);
        setField(term147953, term147953.getClass(), "date", term147954);
        setByteField(term147958, term147958.getClass(), "hour", (byte) 12);
        setByteField(term147958, term147958.getClass(), "minute", (byte) 26);
        setByteField(term147958, term147958.getClass(), "second", (byte) 54);
        setIntField(term147958, term147958.getClass(), "nano", 499786988);
        setField(term147953, term147953.getClass(), "time", term147958);
        setField(term147927, term147927.getClass(), "accessTime", term147953);
        setField(term147925, term147925.getClass(), "card", term147927);
        setField(term147925, term147925.getClass(), "userName", "yjLlTYCCBx");
        setIntField(term147925, term147925.getClass(), "isNetMember", -1490853348);
        setIntField(term147925, term147925.getClass(), "iconId", 78992394);
        setIntField(term147925, term147925.getClass(), "plateId", 1142528937);
        setIntField(term147925, term147925.getClass(), "titleId", 1315223978);
        setIntField(term147925, term147925.getClass(), "partnerId", -2027183455);
        setIntField(term147925, term147925.getClass(), "frameId", -1018926699);
        setIntField(term147925, term147925.getClass(), "selectMapId", 1764513543);
        setIntField(term147925, term147925.getClass(), "totalAwake", 697622913);
        setIntField(term147925, term147925.getClass(), "gradeRating", -1907956934);
        setIntField(term147925, term147925.getClass(), "musicRating", -1932506949);
        setIntField(term147925, term147925.getClass(), "playerRating", -1191178740);
        setIntField(term147925, term147925.getClass(), "highestRating", -1072911681);
        setIntField(term147925, term147925.getClass(), "gradeRank", 237096319);
        setIntField(term147925, term147925.getClass(), "classRank", -129239539);
        setIntField(term147925, term147925.getClass(), "courseRank", 1898041134);
        setField(term147925, term147925.getClass(), "charaSlot", term147990);
        setField(term147925, term147925.getClass(), "charaLockSlot", term148010);
        setLongField(term147925, term147925.getClass(), "contentBit", 1147606516738695966L);
        setIntField(term147925, term147925.getClass(), "playCount", -849607758);
        setField(term147925, term147925.getClass(), "eventWatchedDate", "tmMslEelEQ");
        setField(term147925, term147925.getClass(), "lastGameId", "zQlbOXpNcl");
        setField(term147925, term147925.getClass(), "lastRomVersion", "iDjBOxOVMQ");
        setField(term147925, term147925.getClass(), "lastDataVersion", "QSvmOZQTXd");
        setField(term147925, term147925.getClass(), "lastLoginDate", "vQLwJDUryB");
        setField(term147925, term147925.getClass(), "lastPlayDate", "JhCgwQaWUU");
        setIntField(term147925, term147925.getClass(), "lastPlayCredit", 2104460972);
        setIntField(term147925, term147925.getClass(), "lastPlayMode", -8337895);
        setIntField(term147925, term147925.getClass(), "lastPlaceId", 1708375901);
        setField(term147925, term147925.getClass(), "lastPlaceName", "MbEifzcdun");
        setIntField(term147925, term147925.getClass(), "lastAllNetId", -1947090409);
        setIntField(term147925, term147925.getClass(), "lastRegionId", 318897815);
        setField(term147925, term147925.getClass(), "lastRegionName", "ZXcuwiDFkz");
        setField(term147925, term147925.getClass(), "lastClientId", "OdQhbRFMKu");
        setField(term147925, term147925.getClass(), "lastCountryCode", "pwniyUkqxT");
        setIntField(term147925, term147925.getClass(), "lastSelectEMoney", 1078408023);
        setIntField(term147925, term147925.getClass(), "lastSelectTicket", -1113914353);
        setIntField(term147925, term147925.getClass(), "lastSelectCourse", 860243352);
        setIntField(term147925, term147925.getClass(), "lastCountCourse", 363051486);
        setField(term147925, term147925.getClass(), "firstGameId", "gtChMrVhZn");
        setField(term147925, term147925.getClass(), "firstRomVersion", "wghzZSjyPl");
        setField(term147925, term147925.getClass(), "firstDataVersion", "CPkpKPIQrd");
        setField(term147925, term147925.getClass(), "firstPlayDate", "KTqaReORfO");
        setField(term147925, term147925.getClass(), "compatibleCmVersion", "AfaIIRjDxi");
        setField(term147925, term147925.getClass(), "dailyBonusDate", "oeadlojIQZ");
        setField(term147925, term147925.getClass(), "dailyCourseBonusDate", "DqbGwXvmSC");
        setField(term147925, term147925.getClass(), "lastPairLoginDate", "aIIGYUOaLR");
        setField(term147925, term147925.getClass(), "lastTrialPlayDate", "saqdcGiRfC");
        setIntField(term147925, term147925.getClass(), "playVsCount", 668773961);
        setIntField(term147925, term147925.getClass(), "playSyncCount", -1762018663);
        setIntField(term147925, term147925.getClass(), "winCount", 1974419093);
        setIntField(term147925, term147925.getClass(), "helpCount", -393770145);
        setIntField(term147925, term147925.getClass(), "comboCount", 772000733);
        setLongField(term147925, term147925.getClass(), "totalDeluxscore", -6578681972335380132L);
        setLongField(term147925, term147925.getClass(), "totalBasicDeluxscore", -8752317699940489111L);
        setLongField(term147925, term147925.getClass(), "totalAdvancedDeluxscore", 5434575209023198750L);
        setLongField(term147925, term147925.getClass(), "totalExpertDeluxscore", 7725840165097701315L);
        setLongField(term147925, term147925.getClass(), "totalMasterDeluxscore", 8461427776474793729L);
        setLongField(term147925, term147925.getClass(), "totalReMasterDeluxscore", 7158622075119287203L);
        setIntField(term147925, term147925.getClass(), "totalSync", -1694461759);
        setIntField(term147925, term147925.getClass(), "totalBasicSync", -1209885402);
        setIntField(term147925, term147925.getClass(), "totalAdvancedSync", 544600300);
        setIntField(term147925, term147925.getClass(), "totalExpertSync", 680424981);
        setIntField(term147925, term147925.getClass(), "totalMasterSync", -972500336);
        setIntField(term147925, term147925.getClass(), "totalReMasterSync", 1208675424);
        setLongField(term147925, term147925.getClass(), "totalAchievement", -6564323490735734506L);
        setLongField(term147925, term147925.getClass(), "totalBasicAchievement", 2835318688230788293L);
        setLongField(term147925, term147925.getClass(), "totalAdvancedAchievement", -6102220116948409664L);
        setLongField(term147925, term147925.getClass(), "totalExpertAchievement", 6465003282975504465L);
        setLongField(term147925, term147925.getClass(), "totalMasterAchievement", -5180197912905445262L);
        setLongField(term147925, term147925.getClass(), "totalReMasterAchievement", -8600540675658281925L);
        setLongField(term147925, term147925.getClass(), "playerOldRating", -8807920657748272707L);
        setLongField(term147925, term147925.getClass(), "playerNewRating", -5145493255578520084L);
        setIntField(term147925, term147925.getClass(), "banState", 1546061631);
        setLongField(term147925, term147925.getClass(), "dateTime", -3030102582715798903L);
        setField(term147923, term147923.getClass(), "user", term147925);
        setIntField(term147923, term147923.getClass(), "selectMusicId", -1211628823);
        setIntField(term147923, term147923.getClass(), "selectDifficultyId", -1281293973);
        setIntField(term147923, term147923.getClass(), "categoryIndex", -542138921);
        setIntField(term147923, term147923.getClass(), "musicIndex", 1572030763);
        setIntField(term147923, term147923.getClass(), "extraFlag", -1020308117);
        setIntField(term147923, term147923.getClass(), "selectScoreType", -1195161500);
        setLongField(term147923, term147923.getClass(), "extendContentBit", 7672458152252612386L);
        setBooleanField(term147923, term147923.getClass(), "isPhotoAgree", true);
        setBooleanField(term147923, term147923.getClass(), "isGotoCodeRead", false);
        setBooleanField(term147923, term147923.getClass(), "selectResultDetails", true);
        setIntField(term147923, term147923.getClass(), "sortCategorySetting", -824702620);
        setIntField(term147923, term147923.getClass(), "sortMusicSetting", -1695248876);
        setField(term147923, term147923.getClass(), "selectedCardList", term148300);
        setField(term147923, term147923.getClass(), "encountMapNpcList", term148304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGotoCodeRead", argTypes, term147923, args);
    }

};


