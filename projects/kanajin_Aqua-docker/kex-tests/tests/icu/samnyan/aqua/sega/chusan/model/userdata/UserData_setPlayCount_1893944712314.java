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

public class UserData_setPlayCount_1893944712314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285762;
     Object term285839;

    public UserData_setPlayCount_1893944712314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285762 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285762, term285762.getClass(), "id", 0L);
        setField(term285762, term285762.getClass(), "card", null);
        setField(term285762, term285762.getClass(), "userName", null);
        setIntField(term285762, term285762.getClass(), "level", 0);
        setIntField(term285762, term285762.getClass(), "reincarnationNum", 0);
        setField(term285762, term285762.getClass(), "exp", null);
        setLongField(term285762, term285762.getClass(), "point", 0L);
        setLongField(term285762, term285762.getClass(), "totalPoint", 0L);
        setIntField(term285762, term285762.getClass(), "playCount", 0);
        setIntField(term285762, term285762.getClass(), "multiPlayCount", 0);
        setIntField(term285762, term285762.getClass(), "playerRating", 0);
        setIntField(term285762, term285762.getClass(), "highestRating", 0);
        setIntField(term285762, term285762.getClass(), "nameplateId", 0);
        setIntField(term285762, term285762.getClass(), "frameId", 0);
        setIntField(term285762, term285762.getClass(), "characterId", 0);
        setIntField(term285762, term285762.getClass(), "trophyId", 0);
        setIntField(term285762, term285762.getClass(), "playedTutorialBit", 0);
        setIntField(term285762, term285762.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285762, term285762.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285762, term285762.getClass(), "totalMapNum", 0);
        setLongField(term285762, term285762.getClass(), "totalHiScore", 0L);
        setLongField(term285762, term285762.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285762, term285762.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285762, term285762.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285762, term285762.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285762, term285762.getClass(), "totalUltimaHighScore", 0L);
        setField(term285762, term285762.getClass(), "eventWatchedDate", null);
        setIntField(term285762, term285762.getClass(), "friendCount", 0);
        setField(term285762, term285762.getClass(), "firstGameId", null);
        setField(term285762, term285762.getClass(), "firstRomVersion", null);
        setField(term285762, term285762.getClass(), "firstDataVersion", null);
        setField(term285762, term285762.getClass(), "firstPlayDate", null);
        setField(term285762, term285762.getClass(), "lastGameId", null);
        setField(term285762, term285762.getClass(), "lastRomVersion", null);
        setField(term285762, term285762.getClass(), "lastDataVersion", null);
        setField(term285762, term285762.getClass(), "lastLoginDate", null);
        setField(term285762, term285762.getClass(), "lastPlayDate", null);
        setIntField(term285762, term285762.getClass(), "lastPlaceId", 0);
        setField(term285762, term285762.getClass(), "lastPlaceName", null);
        setField(term285762, term285762.getClass(), "lastRegionId", null);
        setField(term285762, term285762.getClass(), "lastRegionName", null);
        setField(term285762, term285762.getClass(), "lastAllNetId", null);
        setField(term285762, term285762.getClass(), "lastClientId", null);
        setField(term285762, term285762.getClass(), "lastCountryCode", null);
        setField(term285762, term285762.getClass(), "userNameEx", null);
        setField(term285762, term285762.getClass(), "compatibleCmVersion", null);
        setIntField(term285762, term285762.getClass(), "medal", 0);
        setIntField(term285762, term285762.getClass(), "mapIconId", 0);
        setIntField(term285762, term285762.getClass(), "voiceId", 0);
        setIntField(term285762, term285762.getClass(), "avatarWear", 0);
        setIntField(term285762, term285762.getClass(), "avatarHead", 0);
        setIntField(term285762, term285762.getClass(), "avatarFace", 0);
        setIntField(term285762, term285762.getClass(), "avatarSkin", 0);
        setIntField(term285762, term285762.getClass(), "avatarItem", 0);
        setIntField(term285762, term285762.getClass(), "avatarFront", 0);
        setIntField(term285762, term285762.getClass(), "avatarBack", 0);
        setIntField(term285762, term285762.getClass(), "classEmblemBase", 0);
        setIntField(term285762, term285762.getClass(), "classEmblemMedal", 0);
        setIntField(term285762, term285762.getClass(), "stockedGridCount", 0);
        setIntField(term285762, term285762.getClass(), "exMapLoopCount", 0);
        setIntField(term285762, term285762.getClass(), "netBattlePlayCount", 0);
        setIntField(term285762, term285762.getClass(), "netBattleWinCount", 0);
        setIntField(term285762, term285762.getClass(), "netBattleLoseCount", 0);
        setIntField(term285762, term285762.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285762, term285762.getClass(), "charaIllustId", 0);
        setIntField(term285762, term285762.getClass(), "skillId", 0);
        setIntField(term285762, term285762.getClass(), "overPowerPoint", 0);
        setIntField(term285762, term285762.getClass(), "overPowerRate", 0);
        setIntField(term285762, term285762.getClass(), "overPowerLowerRank", 0);
        setIntField(term285762, term285762.getClass(), "avatarPoint", 0);
        setIntField(term285762, term285762.getClass(), "battleRankId", 0);
        setIntField(term285762, term285762.getClass(), "battleRankPoint", 0);
        setIntField(term285762, term285762.getClass(), "eliteRankPoint", 0);
        setIntField(term285762, term285762.getClass(), "netBattle1stCount", 0);
        setIntField(term285762, term285762.getClass(), "netBattle2ndCount", 0);
        setIntField(term285762, term285762.getClass(), "netBattle3rdCount", 0);
        setIntField(term285762, term285762.getClass(), "netBattle4thCount", 0);
        setIntField(term285762, term285762.getClass(), "netBattleCorrection", 0);
        setIntField(term285762, term285762.getClass(), "netBattleErrCnt", 0);
        setIntField(term285762, term285762.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285762, term285762.getClass(), "battleRewardStatus", 0);
        setIntField(term285762, term285762.getClass(), "battleRewardIndex", 0);
        setIntField(term285762, term285762.getClass(), "battleRewardCount", 0);
        setIntField(term285762, term285762.getClass(), "ext1", 0);
        setIntField(term285762, term285762.getClass(), "ext2", 0);
        setIntField(term285762, term285762.getClass(), "ext3", 0);
        setIntField(term285762, term285762.getClass(), "ext4", 0);
        setIntField(term285762, term285762.getClass(), "ext5", 0);
        setIntField(term285762, term285762.getClass(), "ext6", 0);
        setIntField(term285762, term285762.getClass(), "ext7", 0);
        setIntField(term285762, term285762.getClass(), "ext8", 0);
        setIntField(term285762, term285762.getClass(), "ext9", 0);
        setIntField(term285762, term285762.getClass(), "ext10", 0);
        setField(term285762, term285762.getClass(), "extStr1", null);
        setField(term285762, term285762.getClass(), "extStr2", null);
        setLongField(term285762, term285762.getClass(), "extLong1", 0L);
        setLongField(term285762, term285762.getClass(), "extLong2", 0L);
        setField(term285762, term285762.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285762, term285762.getClass(), "isNetBattleHost", false);
        setIntField(term285762, term285762.getClass(), "netBattleEndState", 0);
        term285839 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term285839;
        callMethod(klass, "setPlayCount", argTypes, term285762, args);
    }

};


