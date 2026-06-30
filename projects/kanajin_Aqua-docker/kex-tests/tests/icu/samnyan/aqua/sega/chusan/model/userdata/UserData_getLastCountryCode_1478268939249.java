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

public class UserData_getLastCountryCode_1478268939249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280747;

    public UserData_getLastCountryCode_1478268939249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280747 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term280747, term280747.getClass(), "id", 0L);
        setField(term280747, term280747.getClass(), "card", null);
        setField(term280747, term280747.getClass(), "userName", null);
        setIntField(term280747, term280747.getClass(), "level", 0);
        setIntField(term280747, term280747.getClass(), "reincarnationNum", 0);
        setField(term280747, term280747.getClass(), "exp", null);
        setLongField(term280747, term280747.getClass(), "point", 0L);
        setLongField(term280747, term280747.getClass(), "totalPoint", 0L);
        setIntField(term280747, term280747.getClass(), "playCount", 0);
        setIntField(term280747, term280747.getClass(), "multiPlayCount", 0);
        setIntField(term280747, term280747.getClass(), "playerRating", 0);
        setIntField(term280747, term280747.getClass(), "highestRating", 0);
        setIntField(term280747, term280747.getClass(), "nameplateId", 0);
        setIntField(term280747, term280747.getClass(), "frameId", 0);
        setIntField(term280747, term280747.getClass(), "characterId", 0);
        setIntField(term280747, term280747.getClass(), "trophyId", 0);
        setIntField(term280747, term280747.getClass(), "playedTutorialBit", 0);
        setIntField(term280747, term280747.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term280747, term280747.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term280747, term280747.getClass(), "totalMapNum", 0);
        setLongField(term280747, term280747.getClass(), "totalHiScore", 0L);
        setLongField(term280747, term280747.getClass(), "totalBasicHighScore", 0L);
        setLongField(term280747, term280747.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term280747, term280747.getClass(), "totalExpertHighScore", 0L);
        setLongField(term280747, term280747.getClass(), "totalMasterHighScore", 0L);
        setLongField(term280747, term280747.getClass(), "totalUltimaHighScore", 0L);
        setField(term280747, term280747.getClass(), "eventWatchedDate", null);
        setIntField(term280747, term280747.getClass(), "friendCount", 0);
        setField(term280747, term280747.getClass(), "firstGameId", null);
        setField(term280747, term280747.getClass(), "firstRomVersion", null);
        setField(term280747, term280747.getClass(), "firstDataVersion", null);
        setField(term280747, term280747.getClass(), "firstPlayDate", null);
        setField(term280747, term280747.getClass(), "lastGameId", null);
        setField(term280747, term280747.getClass(), "lastRomVersion", null);
        setField(term280747, term280747.getClass(), "lastDataVersion", null);
        setField(term280747, term280747.getClass(), "lastLoginDate", null);
        setField(term280747, term280747.getClass(), "lastPlayDate", null);
        setIntField(term280747, term280747.getClass(), "lastPlaceId", 0);
        setField(term280747, term280747.getClass(), "lastPlaceName", null);
        setField(term280747, term280747.getClass(), "lastRegionId", null);
        setField(term280747, term280747.getClass(), "lastRegionName", null);
        setField(term280747, term280747.getClass(), "lastAllNetId", null);
        setField(term280747, term280747.getClass(), "lastClientId", null);
        setField(term280747, term280747.getClass(), "lastCountryCode", null);
        setField(term280747, term280747.getClass(), "userNameEx", null);
        setField(term280747, term280747.getClass(), "compatibleCmVersion", null);
        setIntField(term280747, term280747.getClass(), "medal", 0);
        setIntField(term280747, term280747.getClass(), "mapIconId", 0);
        setIntField(term280747, term280747.getClass(), "voiceId", 0);
        setIntField(term280747, term280747.getClass(), "avatarWear", 0);
        setIntField(term280747, term280747.getClass(), "avatarHead", 0);
        setIntField(term280747, term280747.getClass(), "avatarFace", 0);
        setIntField(term280747, term280747.getClass(), "avatarSkin", 0);
        setIntField(term280747, term280747.getClass(), "avatarItem", 0);
        setIntField(term280747, term280747.getClass(), "avatarFront", 0);
        setIntField(term280747, term280747.getClass(), "avatarBack", 0);
        setIntField(term280747, term280747.getClass(), "classEmblemBase", 0);
        setIntField(term280747, term280747.getClass(), "classEmblemMedal", 0);
        setIntField(term280747, term280747.getClass(), "stockedGridCount", 0);
        setIntField(term280747, term280747.getClass(), "exMapLoopCount", 0);
        setIntField(term280747, term280747.getClass(), "netBattlePlayCount", 0);
        setIntField(term280747, term280747.getClass(), "netBattleWinCount", 0);
        setIntField(term280747, term280747.getClass(), "netBattleLoseCount", 0);
        setIntField(term280747, term280747.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term280747, term280747.getClass(), "charaIllustId", 0);
        setIntField(term280747, term280747.getClass(), "skillId", 0);
        setIntField(term280747, term280747.getClass(), "overPowerPoint", 0);
        setIntField(term280747, term280747.getClass(), "overPowerRate", 0);
        setIntField(term280747, term280747.getClass(), "overPowerLowerRank", 0);
        setIntField(term280747, term280747.getClass(), "avatarPoint", 0);
        setIntField(term280747, term280747.getClass(), "battleRankId", 0);
        setIntField(term280747, term280747.getClass(), "battleRankPoint", 0);
        setIntField(term280747, term280747.getClass(), "eliteRankPoint", 0);
        setIntField(term280747, term280747.getClass(), "netBattle1stCount", 0);
        setIntField(term280747, term280747.getClass(), "netBattle2ndCount", 0);
        setIntField(term280747, term280747.getClass(), "netBattle3rdCount", 0);
        setIntField(term280747, term280747.getClass(), "netBattle4thCount", 0);
        setIntField(term280747, term280747.getClass(), "netBattleCorrection", 0);
        setIntField(term280747, term280747.getClass(), "netBattleErrCnt", 0);
        setIntField(term280747, term280747.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term280747, term280747.getClass(), "battleRewardStatus", 0);
        setIntField(term280747, term280747.getClass(), "battleRewardIndex", 0);
        setIntField(term280747, term280747.getClass(), "battleRewardCount", 0);
        setIntField(term280747, term280747.getClass(), "ext1", 0);
        setIntField(term280747, term280747.getClass(), "ext2", 0);
        setIntField(term280747, term280747.getClass(), "ext3", 0);
        setIntField(term280747, term280747.getClass(), "ext4", 0);
        setIntField(term280747, term280747.getClass(), "ext5", 0);
        setIntField(term280747, term280747.getClass(), "ext6", 0);
        setIntField(term280747, term280747.getClass(), "ext7", 0);
        setIntField(term280747, term280747.getClass(), "ext8", 0);
        setIntField(term280747, term280747.getClass(), "ext9", 0);
        setIntField(term280747, term280747.getClass(), "ext10", 0);
        setField(term280747, term280747.getClass(), "extStr1", null);
        setField(term280747, term280747.getClass(), "extStr2", null);
        setLongField(term280747, term280747.getClass(), "extLong1", 0L);
        setLongField(term280747, term280747.getClass(), "extLong2", 0L);
        setField(term280747, term280747.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term280747, term280747.getClass(), "isNetBattleHost", false);
        setIntField(term280747, term280747.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastCountryCode", argTypes, term280747, args);
    }

};


