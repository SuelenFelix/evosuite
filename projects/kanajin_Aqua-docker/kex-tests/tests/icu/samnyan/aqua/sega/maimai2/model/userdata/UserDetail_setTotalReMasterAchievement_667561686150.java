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

public class UserDetail_setTotalReMasterAchievement_667561686150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280482;
     Object term280855;

    public UserDetail_setTotalReMasterAchievement_667561686150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term280486 = new Long(-7589547201844161961L);
        Integer term280549 = new Integer(-678230923);
        Integer term280551 = new Integer(2001978730);
        Integer term280553 = new Integer(835522995);
        Integer term280555 = new Integer(209416345);
        Integer term280557 = new Integer(119693843);
        Integer term280559 = new Integer(1525937366);
        Integer term280561 = new Integer(450142186);
        Integer term280563 = new Integer(874917656);
        Integer term280565 = new Integer(998050776);
        ArrayList term280547 = new ArrayList();
        ((ArrayList) term280547).add(term280549);
        ((ArrayList) term280547).add(term280551);
        ((ArrayList) term280547).add(term280553);
        ((ArrayList) term280547).add(term280555);
        ((ArrayList) term280547).add(term280557);
        ((ArrayList) term280547).add(term280559);
        ((ArrayList) term280547).add(term280561);
        ((ArrayList) term280547).add(term280563);
        ((ArrayList) term280547).add(term280565);
        Integer term280571 = new Integer(-1154360532);
        Integer term280573 = new Integer(-1414782360);
        Integer term280575 = new Integer(812774787);
        Integer term280577 = new Integer(1955108847);
        Integer term280579 = new Integer(601282140);
        Integer term280581 = new Integer(-1989711686);
        Integer term280583 = new Integer(-427352130);
        Integer term280585 = new Integer(490225359);
        ArrayList term280569 = new ArrayList();
        ((ArrayList) term280569).add(term280571);
        ((ArrayList) term280569).add(term280573);
        ((ArrayList) term280569).add(term280575);
        ((ArrayList) term280569).add(term280577);
        ((ArrayList) term280569).add(term280579);
        ((ArrayList) term280569).add(term280581);
        ((ArrayList) term280569).add(term280583);
        ((ArrayList) term280569).add(term280585);
        term280482 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term280484 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term280500 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280501 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280505 = newInstance(Class.forName("java.time.LocalTime"));
        Object term280510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280515 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term280482, term280482.getClass(), "id", -5882399806153214183L);
        setLongField(term280484, term280484.getClass(), "id", 8851351187127807528L);
        setField(term280484, term280484.getClass(), "extId", term280486);
        setField(term280484, term280484.getClass(), "luid", "BybNDgOqaU");
        setIntField(term280501, term280501.getClass(), "year", 2017);
        setShortField(term280501, term280501.getClass(), "month", (short) 2);
        setShortField(term280501, term280501.getClass(), "day", (short) 5);
        setField(term280500, term280500.getClass(), "date", term280501);
        setByteField(term280505, term280505.getClass(), "hour", (byte) 21);
        setByteField(term280505, term280505.getClass(), "minute", (byte) 39);
        setByteField(term280505, term280505.getClass(), "second", (byte) 40);
        setIntField(term280505, term280505.getClass(), "nano", 124450071);
        setField(term280500, term280500.getClass(), "time", term280505);
        setField(term280484, term280484.getClass(), "registerTime", term280500);
        setIntField(term280511, term280511.getClass(), "year", 2017);
        setShortField(term280511, term280511.getClass(), "month", (short) 12);
        setShortField(term280511, term280511.getClass(), "day", (short) 4);
        setField(term280510, term280510.getClass(), "date", term280511);
        setByteField(term280515, term280515.getClass(), "hour", (byte) 17);
        setByteField(term280515, term280515.getClass(), "minute", (byte) 31);
        setByteField(term280515, term280515.getClass(), "second", (byte) 26);
        setIntField(term280515, term280515.getClass(), "nano", 462103828);
        setField(term280510, term280510.getClass(), "time", term280515);
        setField(term280484, term280484.getClass(), "accessTime", term280510);
        setField(term280482, term280482.getClass(), "card", term280484);
        setField(term280482, term280482.getClass(), "userName", "kBHetuXVIX");
        setIntField(term280482, term280482.getClass(), "isNetMember", 16109140);
        setIntField(term280482, term280482.getClass(), "iconId", -822251246);
        setIntField(term280482, term280482.getClass(), "plateId", -408175867);
        setIntField(term280482, term280482.getClass(), "titleId", 1218877971);
        setIntField(term280482, term280482.getClass(), "partnerId", 1248698741);
        setIntField(term280482, term280482.getClass(), "frameId", 563911514);
        setIntField(term280482, term280482.getClass(), "selectMapId", 1278145075);
        setIntField(term280482, term280482.getClass(), "totalAwake", 347582830);
        setIntField(term280482, term280482.getClass(), "gradeRating", -462578945);
        setIntField(term280482, term280482.getClass(), "musicRating", -1978832006);
        setIntField(term280482, term280482.getClass(), "playerRating", -907787831);
        setIntField(term280482, term280482.getClass(), "highestRating", 1652169311);
        setIntField(term280482, term280482.getClass(), "gradeRank", -6383553);
        setIntField(term280482, term280482.getClass(), "classRank", -107860370);
        setIntField(term280482, term280482.getClass(), "courseRank", -2028015650);
        setField(term280482, term280482.getClass(), "charaSlot", term280547);
        setField(term280482, term280482.getClass(), "charaLockSlot", term280569);
        setLongField(term280482, term280482.getClass(), "contentBit", -3495839072378485289L);
        setIntField(term280482, term280482.getClass(), "playCount", 937869088);
        setField(term280482, term280482.getClass(), "eventWatchedDate", "wjgkxGVWLp");
        setField(term280482, term280482.getClass(), "lastGameId", "CGBDZPutSb");
        setField(term280482, term280482.getClass(), "lastRomVersion", "zlUSnfUdoF");
        setField(term280482, term280482.getClass(), "lastDataVersion", "HdpjMQhjhR");
        setField(term280482, term280482.getClass(), "lastLoginDate", "YGkFfIaeGd");
        setField(term280482, term280482.getClass(), "lastPlayDate", "yLXjLruNNP");
        setIntField(term280482, term280482.getClass(), "lastPlayCredit", 1274857950);
        setIntField(term280482, term280482.getClass(), "lastPlayMode", -1368741236);
        setIntField(term280482, term280482.getClass(), "lastPlaceId", -1881603208);
        setField(term280482, term280482.getClass(), "lastPlaceName", "VPHDBNPBGm");
        setIntField(term280482, term280482.getClass(), "lastAllNetId", 209901165);
        setIntField(term280482, term280482.getClass(), "lastRegionId", 1483392595);
        setField(term280482, term280482.getClass(), "lastRegionName", "lBIJygADhM");
        setField(term280482, term280482.getClass(), "lastClientId", "rpMOuRGfGr");
        setField(term280482, term280482.getClass(), "lastCountryCode", "QdOdiCkUpj");
        setIntField(term280482, term280482.getClass(), "lastSelectEMoney", -1560857878);
        setIntField(term280482, term280482.getClass(), "lastSelectTicket", 1128160797);
        setIntField(term280482, term280482.getClass(), "lastSelectCourse", 1392820107);
        setIntField(term280482, term280482.getClass(), "lastCountCourse", -1757491303);
        setField(term280482, term280482.getClass(), "firstGameId", "gcbuFHLquR");
        setField(term280482, term280482.getClass(), "firstRomVersion", "qYxAvMgHse");
        setField(term280482, term280482.getClass(), "firstDataVersion", "QOxTTxLEBd");
        setField(term280482, term280482.getClass(), "firstPlayDate", "JNrjfsJkdd");
        setField(term280482, term280482.getClass(), "compatibleCmVersion", "XruLHHzcFI");
        setField(term280482, term280482.getClass(), "dailyBonusDate", "ehfFMFARbX");
        setField(term280482, term280482.getClass(), "dailyCourseBonusDate", "lvVJcUbQhH");
        setField(term280482, term280482.getClass(), "lastPairLoginDate", "aGSTcHytvT");
        setField(term280482, term280482.getClass(), "lastTrialPlayDate", "eajfQtluiX");
        setIntField(term280482, term280482.getClass(), "playVsCount", -999355140);
        setIntField(term280482, term280482.getClass(), "playSyncCount", 1775721129);
        setIntField(term280482, term280482.getClass(), "winCount", 2006719115);
        setIntField(term280482, term280482.getClass(), "helpCount", -1083031518);
        setIntField(term280482, term280482.getClass(), "comboCount", -119206782);
        setLongField(term280482, term280482.getClass(), "totalDeluxscore", -3095164236877812304L);
        setLongField(term280482, term280482.getClass(), "totalBasicDeluxscore", 6448637861320508618L);
        setLongField(term280482, term280482.getClass(), "totalAdvancedDeluxscore", -1112424458049429448L);
        setLongField(term280482, term280482.getClass(), "totalExpertDeluxscore", 4357818337507986191L);
        setLongField(term280482, term280482.getClass(), "totalMasterDeluxscore", -4532237169840283596L);
        setLongField(term280482, term280482.getClass(), "totalReMasterDeluxscore", 6437137488576265803L);
        setIntField(term280482, term280482.getClass(), "totalSync", 1472071010);
        setIntField(term280482, term280482.getClass(), "totalBasicSync", 1265410255);
        setIntField(term280482, term280482.getClass(), "totalAdvancedSync", 2511626);
        setIntField(term280482, term280482.getClass(), "totalExpertSync", 44009888);
        setIntField(term280482, term280482.getClass(), "totalMasterSync", -513392311);
        setIntField(term280482, term280482.getClass(), "totalReMasterSync", 1354727885);
        setLongField(term280482, term280482.getClass(), "totalAchievement", 2301872414120726653L);
        setLongField(term280482, term280482.getClass(), "totalBasicAchievement", 3204297901552405232L);
        setLongField(term280482, term280482.getClass(), "totalAdvancedAchievement", 8964809273821124653L);
        setLongField(term280482, term280482.getClass(), "totalExpertAchievement", 8595701974537837759L);
        setLongField(term280482, term280482.getClass(), "totalMasterAchievement", 6529856194319907021L);
        setLongField(term280482, term280482.getClass(), "totalReMasterAchievement", 6692814842862214029L);
        setLongField(term280482, term280482.getClass(), "playerOldRating", -968126468745239886L);
        setLongField(term280482, term280482.getClass(), "playerNewRating", -3171885568946917303L);
        setIntField(term280482, term280482.getClass(), "banState", 1202764688);
        setLongField(term280482, term280482.getClass(), "dateTime", 3156826472011017123L);
        term280855 = new Long(6907262303973250620L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term280855;
        callMethod(klass, "setTotalReMasterAchievement", argTypes, term280482, args);
    }

};


