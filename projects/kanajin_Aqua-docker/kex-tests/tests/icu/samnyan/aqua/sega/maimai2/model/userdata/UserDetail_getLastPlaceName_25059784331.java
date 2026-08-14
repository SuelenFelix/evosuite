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

public class UserDetail_getLastPlaceName_25059784331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213125;

    public UserDetail_getLastPlaceName_25059784331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term213129 = new Long(-2083524977884307536L);
        Integer term213192 = new Integer(1760654275);
        ArrayList term213190 = new ArrayList();
        ((ArrayList) term213190).add(term213192);
        Integer term213198 = new Integer(-1048247843);
        Integer term213200 = new Integer(-545135207);
        Integer term213202 = new Integer(969786656);
        Integer term213204 = new Integer(-1568320050);
        Integer term213206 = new Integer(398869857);
        ArrayList term213196 = new ArrayList();
        ((ArrayList) term213196).add(term213198);
        ((ArrayList) term213196).add(term213200);
        ((ArrayList) term213196).add(term213202);
        ((ArrayList) term213196).add(term213204);
        ((ArrayList) term213196).add(term213206);
        term213125 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term213127 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term213143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213148 = newInstance(Class.forName("java.time.LocalTime"));
        Object term213153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213158 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term213125, term213125.getClass(), "id", 5258993626790401817L);
        setLongField(term213127, term213127.getClass(), "id", -411091672782917690L);
        setField(term213127, term213127.getClass(), "extId", term213129);
        setField(term213127, term213127.getClass(), "luid", "wLeSxUOcvE");
        setIntField(term213144, term213144.getClass(), "year", 2023);
        setShortField(term213144, term213144.getClass(), "month", (short) 12);
        setShortField(term213144, term213144.getClass(), "day", (short) 26);
        setField(term213143, term213143.getClass(), "date", term213144);
        setByteField(term213148, term213148.getClass(), "hour", (byte) 17);
        setByteField(term213148, term213148.getClass(), "minute", (byte) 38);
        setByteField(term213148, term213148.getClass(), "second", (byte) 54);
        setIntField(term213148, term213148.getClass(), "nano", 703000129);
        setField(term213143, term213143.getClass(), "time", term213148);
        setField(term213127, term213127.getClass(), "registerTime", term213143);
        setIntField(term213154, term213154.getClass(), "year", 2013);
        setShortField(term213154, term213154.getClass(), "month", (short) 8);
        setShortField(term213154, term213154.getClass(), "day", (short) 24);
        setField(term213153, term213153.getClass(), "date", term213154);
        setByteField(term213158, term213158.getClass(), "hour", (byte) 15);
        setByteField(term213158, term213158.getClass(), "minute", (byte) 52);
        setByteField(term213158, term213158.getClass(), "second", (byte) 16);
        setIntField(term213158, term213158.getClass(), "nano", 996842360);
        setField(term213153, term213153.getClass(), "time", term213158);
        setField(term213127, term213127.getClass(), "accessTime", term213153);
        setField(term213125, term213125.getClass(), "card", term213127);
        setField(term213125, term213125.getClass(), "userName", "zXBkiMWyGd");
        setIntField(term213125, term213125.getClass(), "isNetMember", 1399645267);
        setIntField(term213125, term213125.getClass(), "iconId", 1041538795);
        setIntField(term213125, term213125.getClass(), "plateId", 1356367916);
        setIntField(term213125, term213125.getClass(), "titleId", 1576872122);
        setIntField(term213125, term213125.getClass(), "partnerId", 380977694);
        setIntField(term213125, term213125.getClass(), "frameId", -1411160608);
        setIntField(term213125, term213125.getClass(), "selectMapId", 117398006);
        setIntField(term213125, term213125.getClass(), "totalAwake", -1432040068);
        setIntField(term213125, term213125.getClass(), "gradeRating", -153489469);
        setIntField(term213125, term213125.getClass(), "musicRating", 1080583578);
        setIntField(term213125, term213125.getClass(), "playerRating", 283702087);
        setIntField(term213125, term213125.getClass(), "highestRating", 612339159);
        setIntField(term213125, term213125.getClass(), "gradeRank", 1739451740);
        setIntField(term213125, term213125.getClass(), "classRank", -1033928520);
        setIntField(term213125, term213125.getClass(), "courseRank", 2015415340);
        setField(term213125, term213125.getClass(), "charaSlot", term213190);
        setField(term213125, term213125.getClass(), "charaLockSlot", term213196);
        setLongField(term213125, term213125.getClass(), "contentBit", 8489865307349190558L);
        setIntField(term213125, term213125.getClass(), "playCount", -1270808334);
        setField(term213125, term213125.getClass(), "eventWatchedDate", "mfTaddgHFD");
        setField(term213125, term213125.getClass(), "lastGameId", "hIiWppNeiF");
        setField(term213125, term213125.getClass(), "lastRomVersion", "XvaVMuQDMw");
        setField(term213125, term213125.getClass(), "lastDataVersion", "chIxItCXqf");
        setField(term213125, term213125.getClass(), "lastLoginDate", "YefRgMtHiu");
        setField(term213125, term213125.getClass(), "lastPlayDate", "ZiOdvscjbn");
        setIntField(term213125, term213125.getClass(), "lastPlayCredit", 450987049);
        setIntField(term213125, term213125.getClass(), "lastPlayMode", -1761685529);
        setIntField(term213125, term213125.getClass(), "lastPlaceId", -1152845025);
        setField(term213125, term213125.getClass(), "lastPlaceName", "SfejhgGmQy");
        setIntField(term213125, term213125.getClass(), "lastAllNetId", -1141797598);
        setIntField(term213125, term213125.getClass(), "lastRegionId", 2077501415);
        setField(term213125, term213125.getClass(), "lastRegionName", "jFzCDRoglx");
        setField(term213125, term213125.getClass(), "lastClientId", "YIXIcnNfKI");
        setField(term213125, term213125.getClass(), "lastCountryCode", "WAAZWGlLBB");
        setIntField(term213125, term213125.getClass(), "lastSelectEMoney", -1674245464);
        setIntField(term213125, term213125.getClass(), "lastSelectTicket", 1501358200);
        setIntField(term213125, term213125.getClass(), "lastSelectCourse", 606013511);
        setIntField(term213125, term213125.getClass(), "lastCountCourse", -1852663448);
        setField(term213125, term213125.getClass(), "firstGameId", "YjMSFtiUqb");
        setField(term213125, term213125.getClass(), "firstRomVersion", "ynniYZiHaz");
        setField(term213125, term213125.getClass(), "firstDataVersion", "PlFyzwhLog");
        setField(term213125, term213125.getClass(), "firstPlayDate", "pixIdqENqS");
        setField(term213125, term213125.getClass(), "compatibleCmVersion", "GrgTbicTvb");
        setField(term213125, term213125.getClass(), "dailyBonusDate", "PUZSAFeEKV");
        setField(term213125, term213125.getClass(), "dailyCourseBonusDate", "SxDxsgRQrT");
        setField(term213125, term213125.getClass(), "lastPairLoginDate", "pLlOWMrJcg");
        setField(term213125, term213125.getClass(), "lastTrialPlayDate", "sCfJJislWL");
        setIntField(term213125, term213125.getClass(), "playVsCount", -312526763);
        setIntField(term213125, term213125.getClass(), "playSyncCount", 2020033827);
        setIntField(term213125, term213125.getClass(), "winCount", 1422686838);
        setIntField(term213125, term213125.getClass(), "helpCount", 217849440);
        setIntField(term213125, term213125.getClass(), "comboCount", -1464210075);
        setLongField(term213125, term213125.getClass(), "totalDeluxscore", 3118512299469771622L);
        setLongField(term213125, term213125.getClass(), "totalBasicDeluxscore", 9087912550057530744L);
        setLongField(term213125, term213125.getClass(), "totalAdvancedDeluxscore", 435597215139802942L);
        setLongField(term213125, term213125.getClass(), "totalExpertDeluxscore", -9100415003478673923L);
        setLongField(term213125, term213125.getClass(), "totalMasterDeluxscore", -8341553656242259319L);
        setLongField(term213125, term213125.getClass(), "totalReMasterDeluxscore", -5748946727352721449L);
        setIntField(term213125, term213125.getClass(), "totalSync", 624179347);
        setIntField(term213125, term213125.getClass(), "totalBasicSync", 1724442328);
        setIntField(term213125, term213125.getClass(), "totalAdvancedSync", 761455228);
        setIntField(term213125, term213125.getClass(), "totalExpertSync", 894605550);
        setIntField(term213125, term213125.getClass(), "totalMasterSync", -710673930);
        setIntField(term213125, term213125.getClass(), "totalReMasterSync", 573521617);
        setLongField(term213125, term213125.getClass(), "totalAchievement", 1056742977375601296L);
        setLongField(term213125, term213125.getClass(), "totalBasicAchievement", 4376993421044589576L);
        setLongField(term213125, term213125.getClass(), "totalAdvancedAchievement", -8863460315701340850L);
        setLongField(term213125, term213125.getClass(), "totalExpertAchievement", 5596356954385929006L);
        setLongField(term213125, term213125.getClass(), "totalMasterAchievement", 5939509709568012886L);
        setLongField(term213125, term213125.getClass(), "totalReMasterAchievement", 3985366149647872776L);
        setLongField(term213125, term213125.getClass(), "playerOldRating", 5631961646001874420L);
        setLongField(term213125, term213125.getClass(), "playerNewRating", -7696618461813536712L);
        setIntField(term213125, term213125.getClass(), "banState", 1856558520);
        setLongField(term213125, term213125.getClass(), "dateTime", 755596703777616531L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term213125, args);
    }

};


