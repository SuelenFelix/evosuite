package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setNetBattleConsecutiveWinCount_1222052921369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290071;
     Object term290148;

    public UserData_setNetBattleConsecutiveWinCount_1222052921369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290071 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290071, term290071.getClass(), "id", 0L);
        setField(term290071, term290071.getClass(), "card", null);
        setField(term290071, term290071.getClass(), "userName", null);
        setIntField(term290071, term290071.getClass(), "level", 0);
        setIntField(term290071, term290071.getClass(), "reincarnationNum", 0);
        setField(term290071, term290071.getClass(), "exp", null);
        setLongField(term290071, term290071.getClass(), "point", 0L);
        setLongField(term290071, term290071.getClass(), "totalPoint", 0L);
        setIntField(term290071, term290071.getClass(), "playCount", 0);
        setIntField(term290071, term290071.getClass(), "multiPlayCount", 0);
        setIntField(term290071, term290071.getClass(), "playerRating", 0);
        setIntField(term290071, term290071.getClass(), "highestRating", 0);
        setIntField(term290071, term290071.getClass(), "nameplateId", 0);
        setIntField(term290071, term290071.getClass(), "frameId", 0);
        setIntField(term290071, term290071.getClass(), "characterId", 0);
        setIntField(term290071, term290071.getClass(), "trophyId", 0);
        setIntField(term290071, term290071.getClass(), "playedTutorialBit", 0);
        setIntField(term290071, term290071.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290071, term290071.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290071, term290071.getClass(), "totalMapNum", 0);
        setLongField(term290071, term290071.getClass(), "totalHiScore", 0L);
        setLongField(term290071, term290071.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290071, term290071.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290071, term290071.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290071, term290071.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290071, term290071.getClass(), "totalUltimaHighScore", 0L);
        setField(term290071, term290071.getClass(), "eventWatchedDate", null);
        setIntField(term290071, term290071.getClass(), "friendCount", 0);
        setField(term290071, term290071.getClass(), "firstGameId", null);
        setField(term290071, term290071.getClass(), "firstRomVersion", null);
        setField(term290071, term290071.getClass(), "firstDataVersion", null);
        setField(term290071, term290071.getClass(), "firstPlayDate", null);
        setField(term290071, term290071.getClass(), "lastGameId", null);
        setField(term290071, term290071.getClass(), "lastRomVersion", null);
        setField(term290071, term290071.getClass(), "lastDataVersion", null);
        setField(term290071, term290071.getClass(), "lastLoginDate", null);
        setField(term290071, term290071.getClass(), "lastPlayDate", null);
        setIntField(term290071, term290071.getClass(), "lastPlaceId", 0);
        setField(term290071, term290071.getClass(), "lastPlaceName", null);
        setField(term290071, term290071.getClass(), "lastRegionId", null);
        setField(term290071, term290071.getClass(), "lastRegionName", null);
        setField(term290071, term290071.getClass(), "lastAllNetId", null);
        setField(term290071, term290071.getClass(), "lastClientId", null);
        setField(term290071, term290071.getClass(), "lastCountryCode", null);
        setField(term290071, term290071.getClass(), "userNameEx", null);
        setField(term290071, term290071.getClass(), "compatibleCmVersion", null);
        setIntField(term290071, term290071.getClass(), "medal", 0);
        setIntField(term290071, term290071.getClass(), "mapIconId", 0);
        setIntField(term290071, term290071.getClass(), "voiceId", 0);
        setIntField(term290071, term290071.getClass(), "avatarWear", 0);
        setIntField(term290071, term290071.getClass(), "avatarHead", 0);
        setIntField(term290071, term290071.getClass(), "avatarFace", 0);
        setIntField(term290071, term290071.getClass(), "avatarSkin", 0);
        setIntField(term290071, term290071.getClass(), "avatarItem", 0);
        setIntField(term290071, term290071.getClass(), "avatarFront", 0);
        setIntField(term290071, term290071.getClass(), "avatarBack", 0);
        setIntField(term290071, term290071.getClass(), "classEmblemBase", 0);
        setIntField(term290071, term290071.getClass(), "classEmblemMedal", 0);
        setIntField(term290071, term290071.getClass(), "stockedGridCount", 0);
        setIntField(term290071, term290071.getClass(), "exMapLoopCount", 0);
        setIntField(term290071, term290071.getClass(), "netBattlePlayCount", 0);
        setIntField(term290071, term290071.getClass(), "netBattleWinCount", 0);
        setIntField(term290071, term290071.getClass(), "netBattleLoseCount", 0);
        setIntField(term290071, term290071.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290071, term290071.getClass(), "charaIllustId", 0);
        setIntField(term290071, term290071.getClass(), "skillId", 0);
        setIntField(term290071, term290071.getClass(), "overPowerPoint", 0);
        setIntField(term290071, term290071.getClass(), "overPowerRate", 0);
        setIntField(term290071, term290071.getClass(), "overPowerLowerRank", 0);
        setIntField(term290071, term290071.getClass(), "avatarPoint", 0);
        setIntField(term290071, term290071.getClass(), "battleRankId", 0);
        setIntField(term290071, term290071.getClass(), "battleRankPoint", 0);
        setIntField(term290071, term290071.getClass(), "eliteRankPoint", 0);
        setIntField(term290071, term290071.getClass(), "netBattle1stCount", 0);
        setIntField(term290071, term290071.getClass(), "netBattle2ndCount", 0);
        setIntField(term290071, term290071.getClass(), "netBattle3rdCount", 0);
        setIntField(term290071, term290071.getClass(), "netBattle4thCount", 0);
        setIntField(term290071, term290071.getClass(), "netBattleCorrection", 0);
        setIntField(term290071, term290071.getClass(), "netBattleErrCnt", 0);
        setIntField(term290071, term290071.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290071, term290071.getClass(), "battleRewardStatus", 0);
        setIntField(term290071, term290071.getClass(), "battleRewardIndex", 0);
        setIntField(term290071, term290071.getClass(), "battleRewardCount", 0);
        setIntField(term290071, term290071.getClass(), "ext1", 0);
        setIntField(term290071, term290071.getClass(), "ext2", 0);
        setIntField(term290071, term290071.getClass(), "ext3", 0);
        setIntField(term290071, term290071.getClass(), "ext4", 0);
        setIntField(term290071, term290071.getClass(), "ext5", 0);
        setIntField(term290071, term290071.getClass(), "ext6", 0);
        setIntField(term290071, term290071.getClass(), "ext7", 0);
        setIntField(term290071, term290071.getClass(), "ext8", 0);
        setIntField(term290071, term290071.getClass(), "ext9", 0);
        setIntField(term290071, term290071.getClass(), "ext10", 0);
        setField(term290071, term290071.getClass(), "extStr1", null);
        setField(term290071, term290071.getClass(), "extStr2", null);
        setLongField(term290071, term290071.getClass(), "extLong1", 0L);
        setLongField(term290071, term290071.getClass(), "extLong2", 0L);
        setField(term290071, term290071.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290071, term290071.getClass(), "isNetBattleHost", false);
        setIntField(term290071, term290071.getClass(), "netBattleEndState", 0);
        term290148 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290148;
        callMethod(klass, "setNetBattleConsecutiveWinCount", argTypes, term290071, args);
    }

};


