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

public class UserData_setCharaIllustId_1085180288370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290150;
     Object term290227;

    public UserData_setCharaIllustId_1085180288370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290150 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290150, term290150.getClass(), "id", 0L);
        setField(term290150, term290150.getClass(), "card", null);
        setField(term290150, term290150.getClass(), "userName", null);
        setIntField(term290150, term290150.getClass(), "level", 0);
        setIntField(term290150, term290150.getClass(), "reincarnationNum", 0);
        setField(term290150, term290150.getClass(), "exp", null);
        setLongField(term290150, term290150.getClass(), "point", 0L);
        setLongField(term290150, term290150.getClass(), "totalPoint", 0L);
        setIntField(term290150, term290150.getClass(), "playCount", 0);
        setIntField(term290150, term290150.getClass(), "multiPlayCount", 0);
        setIntField(term290150, term290150.getClass(), "playerRating", 0);
        setIntField(term290150, term290150.getClass(), "highestRating", 0);
        setIntField(term290150, term290150.getClass(), "nameplateId", 0);
        setIntField(term290150, term290150.getClass(), "frameId", 0);
        setIntField(term290150, term290150.getClass(), "characterId", 0);
        setIntField(term290150, term290150.getClass(), "trophyId", 0);
        setIntField(term290150, term290150.getClass(), "playedTutorialBit", 0);
        setIntField(term290150, term290150.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290150, term290150.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290150, term290150.getClass(), "totalMapNum", 0);
        setLongField(term290150, term290150.getClass(), "totalHiScore", 0L);
        setLongField(term290150, term290150.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290150, term290150.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290150, term290150.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290150, term290150.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290150, term290150.getClass(), "totalUltimaHighScore", 0L);
        setField(term290150, term290150.getClass(), "eventWatchedDate", null);
        setIntField(term290150, term290150.getClass(), "friendCount", 0);
        setField(term290150, term290150.getClass(), "firstGameId", null);
        setField(term290150, term290150.getClass(), "firstRomVersion", null);
        setField(term290150, term290150.getClass(), "firstDataVersion", null);
        setField(term290150, term290150.getClass(), "firstPlayDate", null);
        setField(term290150, term290150.getClass(), "lastGameId", null);
        setField(term290150, term290150.getClass(), "lastRomVersion", null);
        setField(term290150, term290150.getClass(), "lastDataVersion", null);
        setField(term290150, term290150.getClass(), "lastLoginDate", null);
        setField(term290150, term290150.getClass(), "lastPlayDate", null);
        setIntField(term290150, term290150.getClass(), "lastPlaceId", 0);
        setField(term290150, term290150.getClass(), "lastPlaceName", null);
        setField(term290150, term290150.getClass(), "lastRegionId", null);
        setField(term290150, term290150.getClass(), "lastRegionName", null);
        setField(term290150, term290150.getClass(), "lastAllNetId", null);
        setField(term290150, term290150.getClass(), "lastClientId", null);
        setField(term290150, term290150.getClass(), "lastCountryCode", null);
        setField(term290150, term290150.getClass(), "userNameEx", null);
        setField(term290150, term290150.getClass(), "compatibleCmVersion", null);
        setIntField(term290150, term290150.getClass(), "medal", 0);
        setIntField(term290150, term290150.getClass(), "mapIconId", 0);
        setIntField(term290150, term290150.getClass(), "voiceId", 0);
        setIntField(term290150, term290150.getClass(), "avatarWear", 0);
        setIntField(term290150, term290150.getClass(), "avatarHead", 0);
        setIntField(term290150, term290150.getClass(), "avatarFace", 0);
        setIntField(term290150, term290150.getClass(), "avatarSkin", 0);
        setIntField(term290150, term290150.getClass(), "avatarItem", 0);
        setIntField(term290150, term290150.getClass(), "avatarFront", 0);
        setIntField(term290150, term290150.getClass(), "avatarBack", 0);
        setIntField(term290150, term290150.getClass(), "classEmblemBase", 0);
        setIntField(term290150, term290150.getClass(), "classEmblemMedal", 0);
        setIntField(term290150, term290150.getClass(), "stockedGridCount", 0);
        setIntField(term290150, term290150.getClass(), "exMapLoopCount", 0);
        setIntField(term290150, term290150.getClass(), "netBattlePlayCount", 0);
        setIntField(term290150, term290150.getClass(), "netBattleWinCount", 0);
        setIntField(term290150, term290150.getClass(), "netBattleLoseCount", 0);
        setIntField(term290150, term290150.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290150, term290150.getClass(), "charaIllustId", 0);
        setIntField(term290150, term290150.getClass(), "skillId", 0);
        setIntField(term290150, term290150.getClass(), "overPowerPoint", 0);
        setIntField(term290150, term290150.getClass(), "overPowerRate", 0);
        setIntField(term290150, term290150.getClass(), "overPowerLowerRank", 0);
        setIntField(term290150, term290150.getClass(), "avatarPoint", 0);
        setIntField(term290150, term290150.getClass(), "battleRankId", 0);
        setIntField(term290150, term290150.getClass(), "battleRankPoint", 0);
        setIntField(term290150, term290150.getClass(), "eliteRankPoint", 0);
        setIntField(term290150, term290150.getClass(), "netBattle1stCount", 0);
        setIntField(term290150, term290150.getClass(), "netBattle2ndCount", 0);
        setIntField(term290150, term290150.getClass(), "netBattle3rdCount", 0);
        setIntField(term290150, term290150.getClass(), "netBattle4thCount", 0);
        setIntField(term290150, term290150.getClass(), "netBattleCorrection", 0);
        setIntField(term290150, term290150.getClass(), "netBattleErrCnt", 0);
        setIntField(term290150, term290150.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290150, term290150.getClass(), "battleRewardStatus", 0);
        setIntField(term290150, term290150.getClass(), "battleRewardIndex", 0);
        setIntField(term290150, term290150.getClass(), "battleRewardCount", 0);
        setIntField(term290150, term290150.getClass(), "ext1", 0);
        setIntField(term290150, term290150.getClass(), "ext2", 0);
        setIntField(term290150, term290150.getClass(), "ext3", 0);
        setIntField(term290150, term290150.getClass(), "ext4", 0);
        setIntField(term290150, term290150.getClass(), "ext5", 0);
        setIntField(term290150, term290150.getClass(), "ext6", 0);
        setIntField(term290150, term290150.getClass(), "ext7", 0);
        setIntField(term290150, term290150.getClass(), "ext8", 0);
        setIntField(term290150, term290150.getClass(), "ext9", 0);
        setIntField(term290150, term290150.getClass(), "ext10", 0);
        setField(term290150, term290150.getClass(), "extStr1", null);
        setField(term290150, term290150.getClass(), "extStr2", null);
        setLongField(term290150, term290150.getClass(), "extLong1", 0L);
        setLongField(term290150, term290150.getClass(), "extLong2", 0L);
        setField(term290150, term290150.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290150, term290150.getClass(), "isNetBattleHost", false);
        setIntField(term290150, term290150.getClass(), "netBattleEndState", 0);
        term290227 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290227;
        callMethod(klass, "setCharaIllustId", argTypes, term290150, args);
    }

};


