/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.demo.truyenfull.lib;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-11-27")
public class TChapter implements org.apache.thrift.TBase<TChapter, TChapter._Fields>, java.io.Serializable, Cloneable, Comparable<TChapter> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TChapter");

  private static final org.apache.thrift.protocol.TField ID_CHAPTER_FIELD_DESC = new org.apache.thrift.protocol.TField("idChapter", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LINK_FIELD_DESC = new org.apache.thrift.protocol.TField("link", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CREATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("createdAt", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField UPDATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedAt", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField COMIC_FIELD_DESC = new org.apache.thrift.protocol.TField("comic", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TChapterStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TChapterTupleSchemeFactory();

  public long idChapter; // required
  public java.lang.String title; // required
  public java.lang.String content; // required
  public java.lang.String link; // required
  public java.lang.String createdAt; // required
  public java.lang.String updatedAt; // required
  public TComic comic; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID_CHAPTER((short)1, "idChapter"),
    TITLE((short)2, "title"),
    CONTENT((short)3, "content"),
    LINK((short)4, "link"),
    CREATED_AT((short)5, "createdAt"),
    UPDATED_AT((short)6, "updatedAt"),
    COMIC((short)7, "comic");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID_CHAPTER
          return ID_CHAPTER;
        case 2: // TITLE
          return TITLE;
        case 3: // CONTENT
          return CONTENT;
        case 4: // LINK
          return LINK;
        case 5: // CREATED_AT
          return CREATED_AT;
        case 6: // UPDATED_AT
          return UPDATED_AT;
        case 7: // COMIC
          return COMIC;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IDCHAPTER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID_CHAPTER, new org.apache.thrift.meta_data.FieldMetaData("idChapter", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LINK, new org.apache.thrift.meta_data.FieldMetaData("link", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_AT, new org.apache.thrift.meta_data.FieldMetaData("createdAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATED_AT, new org.apache.thrift.meta_data.FieldMetaData("updatedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMIC, new org.apache.thrift.meta_data.FieldMetaData("comic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TComic.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TChapter.class, metaDataMap);
  }

  public TChapter() {
  }

  public TChapter(
    long idChapter,
    java.lang.String title,
    java.lang.String content,
    java.lang.String link,
    java.lang.String createdAt,
    java.lang.String updatedAt,
    TComic comic)
  {
    this();
    this.idChapter = idChapter;
    setIdChapterIsSet(true);
    this.title = title;
    this.content = content;
    this.link = link;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.comic = comic;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TChapter(TChapter other) {
    __isset_bitfield = other.__isset_bitfield;
    this.idChapter = other.idChapter;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetContent()) {
      this.content = other.content;
    }
    if (other.isSetLink()) {
      this.link = other.link;
    }
    if (other.isSetCreatedAt()) {
      this.createdAt = other.createdAt;
    }
    if (other.isSetUpdatedAt()) {
      this.updatedAt = other.updatedAt;
    }
    if (other.isSetComic()) {
      this.comic = new TComic(other.comic);
    }
  }

  public TChapter deepCopy() {
    return new TChapter(this);
  }

  @Override
  public void clear() {
    setIdChapterIsSet(false);
    this.idChapter = 0;
    this.title = null;
    this.content = null;
    this.link = null;
    this.createdAt = null;
    this.updatedAt = null;
    this.comic = null;
  }

  public long getIdChapter() {
    return this.idChapter;
  }

  public TChapter setIdChapter(long idChapter) {
    this.idChapter = idChapter;
    setIdChapterIsSet(true);
    return this;
  }

  public void unsetIdChapter() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IDCHAPTER_ISSET_ID);
  }

  /** Returns true if field idChapter is set (has been assigned a value) and false otherwise */
  public boolean isSetIdChapter() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IDCHAPTER_ISSET_ID);
  }

  public void setIdChapterIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IDCHAPTER_ISSET_ID, value);
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public TChapter setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public TChapter setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public java.lang.String getLink() {
    return this.link;
  }

  public TChapter setLink(java.lang.String link) {
    this.link = link;
    return this;
  }

  public void unsetLink() {
    this.link = null;
  }

  /** Returns true if field link is set (has been assigned a value) and false otherwise */
  public boolean isSetLink() {
    return this.link != null;
  }

  public void setLinkIsSet(boolean value) {
    if (!value) {
      this.link = null;
    }
  }

  public java.lang.String getCreatedAt() {
    return this.createdAt;
  }

  public TChapter setCreatedAt(java.lang.String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public void unsetCreatedAt() {
    this.createdAt = null;
  }

  /** Returns true if field createdAt is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedAt() {
    return this.createdAt != null;
  }

  public void setCreatedAtIsSet(boolean value) {
    if (!value) {
      this.createdAt = null;
    }
  }

  public java.lang.String getUpdatedAt() {
    return this.updatedAt;
  }

  public TChapter setUpdatedAt(java.lang.String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public void unsetUpdatedAt() {
    this.updatedAt = null;
  }

  /** Returns true if field updatedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedAt() {
    return this.updatedAt != null;
  }

  public void setUpdatedAtIsSet(boolean value) {
    if (!value) {
      this.updatedAt = null;
    }
  }

  public TComic getComic() {
    return this.comic;
  }

  public TChapter setComic(TComic comic) {
    this.comic = comic;
    return this;
  }

  public void unsetComic() {
    this.comic = null;
  }

  /** Returns true if field comic is set (has been assigned a value) and false otherwise */
  public boolean isSetComic() {
    return this.comic != null;
  }

  public void setComicIsSet(boolean value) {
    if (!value) {
      this.comic = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID_CHAPTER:
      if (value == null) {
        unsetIdChapter();
      } else {
        setIdChapter((java.lang.Long)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((java.lang.String)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((java.lang.String)value);
      }
      break;

    case LINK:
      if (value == null) {
        unsetLink();
      } else {
        setLink((java.lang.String)value);
      }
      break;

    case CREATED_AT:
      if (value == null) {
        unsetCreatedAt();
      } else {
        setCreatedAt((java.lang.String)value);
      }
      break;

    case UPDATED_AT:
      if (value == null) {
        unsetUpdatedAt();
      } else {
        setUpdatedAt((java.lang.String)value);
      }
      break;

    case COMIC:
      if (value == null) {
        unsetComic();
      } else {
        setComic((TComic)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID_CHAPTER:
      return getIdChapter();

    case TITLE:
      return getTitle();

    case CONTENT:
      return getContent();

    case LINK:
      return getLink();

    case CREATED_AT:
      return getCreatedAt();

    case UPDATED_AT:
      return getUpdatedAt();

    case COMIC:
      return getComic();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID_CHAPTER:
      return isSetIdChapter();
    case TITLE:
      return isSetTitle();
    case CONTENT:
      return isSetContent();
    case LINK:
      return isSetLink();
    case CREATED_AT:
      return isSetCreatedAt();
    case UPDATED_AT:
      return isSetUpdatedAt();
    case COMIC:
      return isSetComic();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TChapter)
      return this.equals((TChapter)that);
    return false;
  }

  public boolean equals(TChapter that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_idChapter = true;
    boolean that_present_idChapter = true;
    if (this_present_idChapter || that_present_idChapter) {
      if (!(this_present_idChapter && that_present_idChapter))
        return false;
      if (this.idChapter != that.idChapter)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    boolean this_present_link = true && this.isSetLink();
    boolean that_present_link = true && that.isSetLink();
    if (this_present_link || that_present_link) {
      if (!(this_present_link && that_present_link))
        return false;
      if (!this.link.equals(that.link))
        return false;
    }

    boolean this_present_createdAt = true && this.isSetCreatedAt();
    boolean that_present_createdAt = true && that.isSetCreatedAt();
    if (this_present_createdAt || that_present_createdAt) {
      if (!(this_present_createdAt && that_present_createdAt))
        return false;
      if (!this.createdAt.equals(that.createdAt))
        return false;
    }

    boolean this_present_updatedAt = true && this.isSetUpdatedAt();
    boolean that_present_updatedAt = true && that.isSetUpdatedAt();
    if (this_present_updatedAt || that_present_updatedAt) {
      if (!(this_present_updatedAt && that_present_updatedAt))
        return false;
      if (!this.updatedAt.equals(that.updatedAt))
        return false;
    }

    boolean this_present_comic = true && this.isSetComic();
    boolean that_present_comic = true && that.isSetComic();
    if (this_present_comic || that_present_comic) {
      if (!(this_present_comic && that_present_comic))
        return false;
      if (!this.comic.equals(that.comic))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(idChapter);

    hashCode = hashCode * 8191 + ((isSetTitle()) ? 131071 : 524287);
    if (isSetTitle())
      hashCode = hashCode * 8191 + title.hashCode();

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + content.hashCode();

    hashCode = hashCode * 8191 + ((isSetLink()) ? 131071 : 524287);
    if (isSetLink())
      hashCode = hashCode * 8191 + link.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreatedAt()) ? 131071 : 524287);
    if (isSetCreatedAt())
      hashCode = hashCode * 8191 + createdAt.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdatedAt()) ? 131071 : 524287);
    if (isSetUpdatedAt())
      hashCode = hashCode * 8191 + updatedAt.hashCode();

    hashCode = hashCode * 8191 + ((isSetComic()) ? 131071 : 524287);
    if (isSetComic())
      hashCode = hashCode * 8191 + comic.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TChapter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetIdChapter()).compareTo(other.isSetIdChapter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdChapter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idChapter, other.idChapter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLink()).compareTo(other.isSetLink());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLink()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.link, other.link);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreatedAt()).compareTo(other.isSetCreatedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdAt, other.createdAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUpdatedAt()).compareTo(other.isSetUpdatedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedAt, other.updatedAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetComic()).compareTo(other.isSetComic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comic, other.comic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TChapter(");
    boolean first = true;

    sb.append("idChapter:");
    sb.append(this.idChapter);
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("link:");
    if (this.link == null) {
      sb.append("null");
    } else {
      sb.append(this.link);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdAt:");
    if (this.createdAt == null) {
      sb.append("null");
    } else {
      sb.append(this.createdAt);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updatedAt:");
    if (this.updatedAt == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedAt);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("comic:");
    if (this.comic == null) {
      sb.append("null");
    } else {
      sb.append(this.comic);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (comic != null) {
      comic.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TChapterStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TChapterStandardScheme getScheme() {
      return new TChapterStandardScheme();
    }
  }

  private static class TChapterStandardScheme extends org.apache.thrift.scheme.StandardScheme<TChapter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TChapter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID_CHAPTER
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.idChapter = iprot.readI64();
              struct.setIdChapterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LINK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.link = iprot.readString();
              struct.setLinkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CREATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createdAt = iprot.readString();
              struct.setCreatedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // UPDATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updatedAt = iprot.readString();
              struct.setUpdatedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // COMIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.comic = new TComic();
              struct.comic.read(iprot);
              struct.setComicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TChapter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_CHAPTER_FIELD_DESC);
      oprot.writeI64(struct.idChapter);
      oprot.writeFieldEnd();
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeString(struct.content);
        oprot.writeFieldEnd();
      }
      if (struct.link != null) {
        oprot.writeFieldBegin(LINK_FIELD_DESC);
        oprot.writeString(struct.link);
        oprot.writeFieldEnd();
      }
      if (struct.createdAt != null) {
        oprot.writeFieldBegin(CREATED_AT_FIELD_DESC);
        oprot.writeString(struct.createdAt);
        oprot.writeFieldEnd();
      }
      if (struct.updatedAt != null) {
        oprot.writeFieldBegin(UPDATED_AT_FIELD_DESC);
        oprot.writeString(struct.updatedAt);
        oprot.writeFieldEnd();
      }
      if (struct.comic != null) {
        oprot.writeFieldBegin(COMIC_FIELD_DESC);
        struct.comic.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TChapterTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TChapterTupleScheme getScheme() {
      return new TChapterTupleScheme();
    }
  }

  private static class TChapterTupleScheme extends org.apache.thrift.scheme.TupleScheme<TChapter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TChapter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIdChapter()) {
        optionals.set(0);
      }
      if (struct.isSetTitle()) {
        optionals.set(1);
      }
      if (struct.isSetContent()) {
        optionals.set(2);
      }
      if (struct.isSetLink()) {
        optionals.set(3);
      }
      if (struct.isSetCreatedAt()) {
        optionals.set(4);
      }
      if (struct.isSetUpdatedAt()) {
        optionals.set(5);
      }
      if (struct.isSetComic()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetIdChapter()) {
        oprot.writeI64(struct.idChapter);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
      if (struct.isSetLink()) {
        oprot.writeString(struct.link);
      }
      if (struct.isSetCreatedAt()) {
        oprot.writeString(struct.createdAt);
      }
      if (struct.isSetUpdatedAt()) {
        oprot.writeString(struct.updatedAt);
      }
      if (struct.isSetComic()) {
        struct.comic.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TChapter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.idChapter = iprot.readI64();
        struct.setIdChapterIsSet(true);
      }
      if (incoming.get(1)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
      if (incoming.get(3)) {
        struct.link = iprot.readString();
        struct.setLinkIsSet(true);
      }
      if (incoming.get(4)) {
        struct.createdAt = iprot.readString();
        struct.setCreatedAtIsSet(true);
      }
      if (incoming.get(5)) {
        struct.updatedAt = iprot.readString();
        struct.setUpdatedAtIsSet(true);
      }
      if (incoming.get(6)) {
        struct.comic = new TComic();
        struct.comic.read(iprot);
        struct.setComicIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

