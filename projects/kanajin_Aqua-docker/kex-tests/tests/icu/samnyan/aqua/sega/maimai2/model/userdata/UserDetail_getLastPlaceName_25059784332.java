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

public class UserDetail_getLastPlaceName_25059784332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213180;

    public UserDetail_getLastPlaceName_25059784332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term213184 = new Long(-2083524977884307536L);
        Integer term213247 = new Integer(1760654275);
        ArrayList term213245 = new ArrayList();
        ((ArrayList) term213245).add(term213247);
        Integer term213253 = new Integer(-1048247843);
        Integer term213255 = new Integer(-545135207);
        Integer term213257 = new Integer(969786656);
        Integer term213259 = new Integer(-1568320050);
        Integer term213261 = new Integer(398869857);
        ArrayList term213251 = new ArrayList();
        ((ArrayList) term213251).add(term213253);
        ((ArrayList) term213251).add(term213255);
        ((ArrayList) term213251).add(term213257);
        ((ArrayList) term213251).add(term213259);
        ((ArrayList) term213251).add(term213261);
        term213180 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term213182 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term213198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term213208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213213 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term213180, term213180.getClass(), "id", 5258993626790401817L);
        setLongField(term213182, term213182.getClass(), "id", -411091672782917690L);
        setField(term213182, term213182.getClass(), "extId", term213184);
        setField(term213182, term213182.getClass(), "luid", "wLeSxUOcvE");
        setIntField(term213199, term213199.getClass(), "year", 2023);
        setShortField(term213199, term213199.getClass(), "month", (short) 12);
        setShortField(term213199, term213199.getClass(), "day", (short) 26);
        setField(term213198, term213198.getClass(), "date", term213199);
        setByteField(term213203, term213203.getClass(), "hour", (byte) 17);
        setByteField(term213203, term213203.getClass(), "minute", (byte) 38);
        setByteField(term213203, term213203.getClass(), "second", (byte) 54);
        setIntField(term213203, term213203.getClass(), "nano", 703000129);
        setField(term213198, term213198.getClass(), "time", term213203);
        setField(term213182, term213182.getClass(), "registerTime", term213198);
        setIntField(term213209, term213209.getClass(), "year", 2013);
        setShortField(term213209, term213209.getClass(), "month", (short) 8);
        setShortField(term213209, term213209.getClass(), "day", (short) 24);
        setField(term213208, term213208.getClass(), "date", term213209);
        setByteField(term213213, term213213.getClass(), "hour", (byte) 15);
        setByteField(term213213, term213213.getClass(), "minute", (byte) 52);
        setByteField(term213213, term213213.getClass(), "second", (byte) 16);
        setIntField(term213213, term213213.getClass(), "nano", 996842360);
        setField(term213208, term213208.getClass(), "time", term213213);
        setField(term213182, term213182.getClass(), "accessTime", term213208);
        setField(term213180, term213180.getClass(), "card", term213182);
        setField(term213180, term213180.getClass(), "userName", "zXBkiMWyGd");
        setIntField(term213180, term213180.getClass(), "isNetMember", 1399645267);
        setIntField(term213180, term213180.getClass(), "iconId", 1041538795);
        setIntField(term213180, term213180.getClass(), "plateId", 1356367916);
        setIntField(term213180, term213180.getClass(), "titleId", 1576872122);
        setIntField(term213180, term213180.getClass(), "partnerId", 380977694);
        setIntField(term213180, term213180.getClass(), "frameId", -1411160608);
        setIntField(term213180, term213180.getClass(), "selectMapId", 117398006);
        setIntField(term213180, term213180.getClass(), "totalAwake", -1432040068);
        setIntField(term213180, term213180.getClass(), "gradeRating", -153489469);
        setIntField(term213180, term213180.getClass(), "musicRating", 1080583578);
        setIntField(term213180, term213180.getClass(), "playerRating", 283702087);
        setIntField(term213180, term213180.getClass(), "highestRating", 612339159);
        setIntField(term213180, term213180.getClass(), "gradeRank", 1739451740);
        setIntField(term213180, term213180.getClass(), "classRank", -1033928520);
        setIntField(term213180, term213180.getClass(), "courseRank", 2015415340);
        setField(term213180, term213180.getClass(), "charaSlot", term213245);
        setField(term213180, term213180.getClass(), "charaLockSlot", term213251);
        setLongField(term213180, term213180.getClass(), "contentBit", 8489865307349190558L);
        setIntField(term213180, term213180.getClass(), "playCount", -1270808334);
        setField(term213180, term213180.getClass(), "eventWatchedDate", "mfTaddgHFD");
        setField(term213180, term213180.getClass(), "lastGameId", "hIiWppNeiF");
        setField(term213180, term213180.getClass(), "lastRomVersion", "XvaVMuQDMw");
        setField(term213180, term213180.getClass(), "lastDataVersion", "chIxItCXqf");
        setField(term213180, term213180.getClass(), "lastLoginDate", "YefRgMtHiu");
        setField(term213180, term213180.getClass(), "lastPlayDate", "ZiOdvscjbn");
        setIntField(term213180, term213180.getClass(), "lastPlayCredit", 450987049);
        setIntField(term213180, term213180.getClass(), "lastPlayMode", -1761685529);
        setIntField(term213180, term213180.getClass(), "lastPlaceId", -1152845025);
        setField(term213180, term213180.getClass(), "lastPlaceName", "SfejhgGmQy");
        setIntField(term213180, term213180.getClass(), "lastAllNetId", -1141797598);
        setIntField(term213180, term213180.getClass(), "lastRegionId", 2077501415);
        setField(term213180, term213180.getClass(), "lastRegionName", "jFzCDRoglx");
        setField(term213180, term213180.getClass(), "lastClientId", "YIXIcnNfKI");
        setField(term213180, term213180.getClass(), "lastCountryCode", "WAAZWGlLBB");
        setIntField(term213180, term213180.getClass(), "lastSelectEMoney", -1674245464);
        setIntField(term213180, term213180.getClass(), "lastSelectTicket", 1501358200);
        setIntField(term213180, term213180.getClass(), "lastSelectCourse", 606013511);
        setIntField(term213180, term213180.getClass(), "lastCountCourse", -1852663448);
        setField(term213180, term213180.getClass(), "firstGameId", "YjMSFtiUqb");
        setField(term213180, term213180.getClass(), "firstRomVersion", "ynniYZiHaz");
        setField(term213180, term213180.getClass(), "firstDataVersion", "PlFyzwhLog");
        setField(term213180, term213180.getClass(), "firstPlayDate", "pixIdqENqS");
        setField(term213180, term213180.getClass(), "compatibleCmVersion", "GrgTbicTvb");
        setField(term213180, term213180.getClass(), "dailyBonusDate", "PUZSAFeEKV");
        setField(term213180, term213180.getClass(), "dailyCourseBonusDate", "SxDxsgRQrT");
        setField(term213180, term213180.getClass(), "lastPairLoginDate", "pLlOWMrJcg");
        setField(term213180, term213180.getClass(), "lastTrialPlayDate", "sCfJJislWL");
        setIntField(term213180, term213180.getClass(), "playVsCount", -312526763);
        setIntField(term213180, term213180.getClass(), "playSyncCount", 2020033827);
        setIntField(term213180, term213180.getClass(), "winCount", 1422686838);
        setIntField(term213180, term213180.getClass(), "helpCount", 217849440);
        setIntField(term213180, term213180.getClass(), "comboCount", -1464210075);
        setLongField(term213180, term213180.getClass(), "totalDeluxscore", 3118512299469771622L);
        setLongField(term213180, term213180.getClass(), "totalBasicDeluxscore", 9087912550057530744L);
        setLongField(term213180, term213180.getClass(), "totalAdvancedDeluxscore", 435597215139802942L);
        setLongField(term213180, term213180.getClass(), "totalExpertDeluxscore", -9100415003478673923L);
        setLongField(term213180, term213180.getClass(), "totalMasterDeluxscore", -8341553656242259319L);
        setLongField(term213180, term213180.getClass(), "totalReMasterDeluxscore", -5748946727352721449L);
        setIntField(term213180, term213180.getClass(), "totalSync", 624179347);
        setIntField(term213180, term213180.getClass(), "totalBasicSync", 1724442328);
        setIntField(term213180, term213180.getClass(), "totalAdvancedSync", 761455228);
        setIntField(term213180, term213180.getClass(), "totalExpertSync", 894605550);
        setIntField(term213180, term213180.getClass(), "totalMasterSync", -710673930);
        setIntField(term213180, term213180.getClass(), "totalReMasterSync", 573521617);
        setLongField(term213180, term213180.getClass(), "totalAchievement", 1056742977375601296L);
        setLongField(term213180, term213180.getClass(), "totalBasicAchievement", 4376993421044589576L);
        setLongField(term213180, term213180.getClass(), "totalAdvancedAchievement", -8863460315701340850L);
        setLongField(term213180, term213180.getClass(), "totalExpertAchievement", 5596356954385929006L);
        setLongField(term213180, term213180.getClass(), "totalMasterAchievement", 5939509709568012886L);
        setLongField(term213180, term213180.getClass(), "totalReMasterAchievement", 3985366149647872776L);
        setLongField(term213180, term213180.getClass(), "playerOldRating", 5631961646001874420L);
        setLongField(term213180, term213180.getClass(), "playerNewRating", -7696618461813536712L);
        setIntField(term213180, term213180.getClass(), "banState", 1856558520);
        setLongField(term213180, term213180.getClass(), "dateTime", 755596703777616531L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term213180, args);
    }

};


