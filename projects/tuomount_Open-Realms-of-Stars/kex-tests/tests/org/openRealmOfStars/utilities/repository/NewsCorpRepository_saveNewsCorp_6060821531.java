package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class NewsCorpRepository_saveNewsCorp_6060821531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1716;
     Object term1717;
     Object term1732;

    public NewsCorpRepository_saveNewsCorp_6060821531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1716 = newInstance(Class.forName("org.openRealmOfStars.utilities.repository.NewsCorpRepository"));
        term1717 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term1719 = (byte[]) newByteArray(7);
        byte[] term1727 = (byte[]) newByteArray(2);
        Object term1731 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1717, term1717.getClass(), "written", -1588772968);
        setByteElement(term1719, 0, (byte) 61);
        setByteElement(term1719, 1, (byte) -92);
        setByteElement(term1719, 2, (byte) -42);
        setByteElement(term1719, 3, (byte) 116);
        setByteElement(term1719, 4, (byte) -81);
        setByteElement(term1719, 5, (byte) 102);
        setByteElement(term1719, 6, (byte) -118);
        setField(term1717, term1717.getClass(), "bytearr", term1719);
        setByteElement(term1727, 0, (byte) -126);
        setByteElement(term1727, 1, (byte) -91);
        setField(term1717, term1717.getClass(), "writeBuffer", term1727);
        setField(term1717, term1717.getClass(), "out", null);
        setBooleanField(term1717, term1717.getClass(), "closed", true);
        setField(term1717, term1717.getClass(), "closeLock", term1731);
        Object term1855 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        setField(term1855, term1855.getClass(), "newsText", "");
        setField(term1855, term1855.getClass(), "imageInstructions", "");
        ArrayList term1853 = new ArrayList();
        ((ArrayList) term1853).add(term1855);
        Object term1862 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        setField(term1862, term1862.getClass(), "newsText", "");
        setField(term1862, term1862.getClass(), "imageInstructions", "");
        Object term1865 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        setField(term1865, term1865.getClass(), "newsText", "");
        setField(term1865, term1865.getClass(), "imageInstructions", "");
        Object term1868 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        setField(term1868, term1868.getClass(), "newsText", "");
        setField(term1868, term1868.getClass(), "imageInstructions", "");
        Object term1871 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        setField(term1871, term1871.getClass(), "newsText", "");
        setField(term1871, term1871.getClass(), "imageInstructions", "");
        Object term1874 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        setField(term1874, term1874.getClass(), "newsText", "");
        setField(term1874, term1874.getClass(), "imageInstructions", "");
        ArrayList term1860 = new ArrayList();
        ((ArrayList) term1860).add(term1862);
        ((ArrayList) term1860).add(term1865);
        ((ArrayList) term1860).add(term1868);
        ((ArrayList) term1860).add(term1871);
        ((ArrayList) term1860).add(term1874);
        term1732 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData"));
        Object term1733 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term1747 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 2);
        Object term1748 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term1749 = (int[]) newIntArray(0);
        Object term1751 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term1752 = (int[]) newIntArray(0);
        Object term1754 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term1768 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 1);
        Object term1769 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term1770 = (int[]) newIntArray(0);
        Object term1772 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term1786 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 0);
        Object term1787 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term1801 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 8);
        Object term1802 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term1803 = (int[]) newIntArray(0);
        Object term1805 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term1806 = (int[]) newIntArray(0);
        Object term1808 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term1809 = (int[]) newIntArray(0);
        Object term1811 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term1812 = (int[]) newIntArray(0);
        Object term1814 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term1815 = (int[]) newIntArray(0);
        Object term1817 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term1818 = (int[]) newIntArray(0);
        Object term1820 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term1821 = (int[]) newIntArray(0);
        Object term1823 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term1837 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 0);
        Object term1838 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term1852 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 0);
        setField(term1733, term1733.getClass(), "galaxyStatisticsName", "MuLcgQHgqz");
        setIntField(term1733, term1733.getClass(), "maxPlayers", -93135961);
        setField(term1748, term1748.getClass(), "data", term1749);
        setIntField(term1748, term1748.getClass(), "size", -1);
        setElement(term1747, 0, term1748);
        setField(term1751, term1751.getClass(), "data", term1752);
        setIntField(term1751, term1751.getClass(), "size", -1);
        setElement(term1747, 1, term1751);
        setField(term1733, term1733.getClass(), "dataStat", term1747);
        setField(term1732, term1732.getClass(), "planets", term1733);
        setField(term1754, term1754.getClass(), "galaxyStatisticsName", "xxtlPwDYFs");
        setIntField(term1754, term1754.getClass(), "maxPlayers", -112921587);
        setField(term1769, term1769.getClass(), "data", term1770);
        setIntField(term1769, term1769.getClass(), "size", -1);
        setElement(term1768, 0, term1769);
        setField(term1754, term1754.getClass(), "dataStat", term1768);
        setField(term1732, term1732.getClass(), "population", term1754);
        setField(term1772, term1772.getClass(), "galaxyStatisticsName", "jJCZpVmanW");
        setIntField(term1772, term1772.getClass(), "maxPlayers", 933028652);
        setField(term1772, term1772.getClass(), "dataStat", term1786);
        setField(term1732, term1732.getClass(), "research", term1772);
        setField(term1787, term1787.getClass(), "galaxyStatisticsName", "EGtDIRbSSb");
        setIntField(term1787, term1787.getClass(), "maxPlayers", 287287233);
        setField(term1802, term1802.getClass(), "data", term1803);
        setIntField(term1802, term1802.getClass(), "size", -1);
        setElement(term1801, 0, term1802);
        setField(term1805, term1805.getClass(), "data", term1806);
        setIntField(term1805, term1805.getClass(), "size", -1);
        setElement(term1801, 1, term1805);
        setField(term1808, term1808.getClass(), "data", term1809);
        setIntField(term1808, term1808.getClass(), "size", -1);
        setElement(term1801, 2, term1808);
        setField(term1811, term1811.getClass(), "data", term1812);
        setIntField(term1811, term1811.getClass(), "size", -1);
        setElement(term1801, 3, term1811);
        setField(term1814, term1814.getClass(), "data", term1815);
        setIntField(term1814, term1814.getClass(), "size", -1);
        setElement(term1801, 4, term1814);
        setField(term1817, term1817.getClass(), "data", term1818);
        setIntField(term1817, term1817.getClass(), "size", -1);
        setElement(term1801, 5, term1817);
        setField(term1820, term1820.getClass(), "data", term1821);
        setIntField(term1820, term1820.getClass(), "size", -1);
        setElement(term1801, 6, term1820);
        setElement(term1801, 7, term1814);
        setField(term1787, term1787.getClass(), "dataStat", term1801);
        setField(term1732, term1732.getClass(), "military", term1787);
        setField(term1823, term1823.getClass(), "galaxyStatisticsName", "SzjVpOQTyS");
        setIntField(term1823, term1823.getClass(), "maxPlayers", 962840079);
        setField(term1823, term1823.getClass(), "dataStat", term1837);
        setField(term1732, term1732.getClass(), "cultural", term1823);
        setField(term1838, term1838.getClass(), "galaxyStatisticsName", "MjGYSRKTNF");
        setIntField(term1838, term1838.getClass(), "maxPlayers", 1540719661);
        setField(term1838, term1838.getClass(), "dataStat", term1852);
        setField(term1732, term1732.getClass(), "credit", term1838);
        setField(term1732, term1732.getClass(), "newsData", term1853);
        setField(term1732, term1732.getClass(), "upComingNewsData", term1860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.NewsCorpRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData");
        Object[] args = new Object[2];
        args[0] = term1717;
        args[1] = term1732;
        callMethod(klass, "saveNewsCorp", argTypes, term1716, args);
    }

};


